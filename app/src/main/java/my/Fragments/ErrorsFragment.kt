package my.Fragments


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_errors.*
import my.Activities.R
import java.lang.Exception

class ErrorsFragment : Fragment(),setOutputInterface {
    private var listener: FragmentInteractionListener? = null
    private var errors_view:TextView?=null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view=inflater.inflate(R.layout.fragment_errors, container, false)
        errors_view=view.findViewById(R.id.error_view)

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

    override fun setText(text: String) {
            errors_view?.text= "Errors:\n$text"
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    override fun clearText() {
        error_view.text="Errors:"
    }

    override fun getTextRequest() {

    }
}

interface FragmentInteractionListener {
    fun onFragmentInteraction()
    fun ongettingInputResponse(value:Double)

}
 interface setOutputInterface{
   fun setText(text:String)
    fun clearText()
    fun getTextRequest()
}