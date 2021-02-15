package uz.uskunalar.uz.ui.auth

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_auth.*
import uz.uskunalar.uz.R

class AuthFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_auth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        Handler(Looper.getMainLooper()).postDelayed({
        /* Create an Intent that will start the Menu-Activity. */
//            Toast.makeText(requireContext(), "Handler", Toast.LENGTH_SHORT).show()

        imageViewFirstTop.visibility = View.VISIBLE
        some_id.visibility = View.VISIBLE
        about_auth.visibility = View.VISIBLE
        materialCardView2.visibility = View.VISIBLE
        btnAuth.visibility = View.VISIBLE
//            textAuto.visibility = View.VISIBLE

//        }, 3000)
//        imageViewFirst.visibility = View.INVISIBLE

        var auth = false
        btnAuth.setOnClickListener {
            if (auth) {
                view.findNavController().popBackStack()
                view.findNavController().navigate(R.id.nav_home)

            } else {
                editPhoneNumber.hint = "Смс-код"
                editHintPhoneNumber.hint = "998 93 004 10 24"
                textCode.visibility = View.VISIBLE
                materialCardView3.visibility = View.VISIBLE
                btnAuth.text = "Авторизироваться"
                auth = true
            }
        }
    }

}