package uz.uskunalar.uz.ui.category.subcategory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.uskunalar.uz.R
import uz.uskunalar.uz.ui.home.line.LineAdapter

class CategoryBackFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category_back, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerViewLine = view.findViewById<RecyclerView>(R.id.parent_recyclerview)

        recyclerViewLine.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)

        val mAdapterLine = ParentItemAdapter()
        recyclerViewLine.adapter = mAdapterLine

    }

}