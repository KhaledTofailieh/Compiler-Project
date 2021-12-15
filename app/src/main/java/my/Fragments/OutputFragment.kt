package my.Fragments

import android.annotation.SuppressLint
import android.content.Context

import android.os.Bundle

import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import my.Activities.R

class OutputFragment : Fragment(),setOutputInterface {
    private var listener: FragmentInteractionListener? = null
    private var output_view:TextView?=null
  ///  private lateinit var Imm:InputMethodManager

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view=inflater.inflate(R.layout.fragment_output, container, false)

       // Imm= context!!.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        output_view=view.findViewById(R.id.output_view)
        output_view?.text="OutPut:"
       // output_view.isFocusable=false
        //output_view.isFocusableInTouchMode=false

        /*output_view.setOnEditorActionListener { v, actionId, event ->
            when(actionId){
                EditorInfo.IME_ACTION_DONE->{
                    Imm.hideSoftInputFromWindow(output_view.applicationWindowToken,0)
                    listener!!.ongettingInputResponse(output_view.selectionEnd.toDouble())
                }
            }

            true
        }*/


        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is FragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }


    @SuppressLint("SetTextI18n")
    override fun setText(text: String) {
        val ss=output_view?.text.toString()+"\n"
         output_view?.text=ss +text+""
       // println("vvvvvvvvvvvvv")
    }

    override fun clearText() {
        output_view?.text="OutPut:"
        //println("ssssssssss")
    }

    override fun getTextRequest() {
       // output_view.isFocusable=true
      //  output_view.isFocusableInTouchMode=true
    }
}
