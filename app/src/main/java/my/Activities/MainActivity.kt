package my.Activities



import android.os.Bundle
import android.os.Parcelable
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.Toast
import my.Extras.FilePath
import my.Extras.setConvertInterface
import my.Fragments.*
import my.newLang.AINL

import java.io.FileInputStream
import java.io.FileOutputStream
import java.lang.Exception


class MainActivity : AppCompatActivity(), setOutputInterface, FragmentInteractionListener {
    lateinit var outputListener: setOutputInterface
    lateinit var error_listener:setOutputInterface
     var convert_listener:setConvertInterface?=null
    lateinit var input:EditText
    lateinit var view_pager: ViewPager
    lateinit var tap: TabLayout

        lateinit var outputFragment: OutputFragment
        lateinit var errorsFragment: ErrorsFragment
        var convertedFragment: Convert_Fragment?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.input=findViewById(R.id.input_view)
        this.view_pager=findViewById(R.id.mview_pager)
        this.tap=findViewById(R.id.tab_layout)

        outputFragment= OutputFragment()
       errorsFragment= ErrorsFragment()
        convertedFragment= Convert_Fragment()


        outputListener=outputFragment
        convert_listener= convertedFragment!!
        error_listener=errorsFragment

        val fm=supportFragmentManager
        view_pager.adapter=SectionPagerAdapter(fm)
        tap.setupWithViewPager(view_pager)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
      menuInflater.inflate(R.menu.app_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item!!.itemId){
           R.id.run_button->{

               val myCode=input.text.toString()
               val fos=FileOutputStream(FilePath.path+"/test.txt")
               fos.write(myCode.toByteArray())
               fos.close()
               error_listener.clearText()
               outputListener.clearText()
               val file = FileInputStream(FilePath.path+"/test.txt")
               try {
                   convert_listener?.clear_Text()
                   AINL.main(file,this)
               }catch (e:Exception){
                   println("There is Exception")
                  
                   Toast.makeText(this,"There is an Error", Toast.LENGTH_SHORT).show()
                   error_listener.setText(e.message.toString())
               }
               file.close()
           }
            R.id.convert_btn->{
                val myCode=input.text.toString()
                val fos=FileOutputStream(FilePath.path+"/test.txt")
                fos.write(myCode.toByteArray())
                fos.close()
                error_listener.clearText()
                outputListener.clearText()

                val file = FileInputStream(FilePath.path+"/test.txt")
                try {
                    convert_listener?.clear_Text()
                   val c= AINL.convert(file)
                    convert_listener?.setConvertedText(c)
                }catch (e:Exception){
                    Toast.makeText(this,"There is an Error", Toast.LENGTH_SHORT).show()
                    error_listener.setText(e.message.toString())
                }
                file.close()
            }
        }
        return true
    }

    override fun setText(text: String) {
        outputListener.setText(text)
    }
    override fun clearText() {

    }

    override fun getTextRequest(){
    }

    inner class SectionPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
        override fun getItem(position: Int): Fragment {
            var fragment: Fragment? = null
            when (position) {
                0 -> {
                    fragment =outputFragment
                }
                1 -> {
                    fragment = errorsFragment
                }
                2->{
                    fragment=convertedFragment
                }
            }
            return fragment!!
        }

        override fun getCount(): Int {
            return 3
        }

        override fun getPageTitle(position: Int): CharSequence? =
            when(position){
                0->{
                  "OutPut"
                }
                1->{
                   "Errors"
                }
                2->{
                    "C++"
                }
                else->{
                  ""
                }
            }

    }

    override fun onFragmentInteraction() {
    }

    override fun ongettingInputResponse(value: Double) {
        try {
        }catch (e:Exception){
            println(e)
        }

    }

}

