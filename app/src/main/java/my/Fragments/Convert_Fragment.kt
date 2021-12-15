package my.Fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_convert.*
import my.Activities.R
import my.Extras.setConvertInterface

class Convert_Fragment : Fragment() ,setConvertInterface {

     var listener: FragmentInteractionListener?=null
     var converted_code:TextView?=null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_convert, container, false)
        converted_code=view.findViewById(R.id.convert_view)
        return view
    }


    override fun setConvertedText(text: String) {
    val ss=converted_code?.text.toString() +"\n"+text
      converted_code?.text=ss

    }

    override fun clear_Text() {
        converted_code?.text ="C++ Code:"
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

}
