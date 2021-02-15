package uz.uskunalar.uz.ui.category.mainCategory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.uskunalar.uz.R
import uz.uskunalar.uz.ui.home.line.LineAdapter

class CategoryFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerViewLine = view.findViewById<RecyclerView>(R.id.recyclerViewCategory)

        recyclerViewLine.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)

        val mAdapterLine = CategoryAdapter()
        recyclerViewLine.adapter = mAdapterLine

        mAdapterLine.onItemClick={
            Toast.makeText(requireContext(), "$it", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.nav_category_back)
        }

    }

}