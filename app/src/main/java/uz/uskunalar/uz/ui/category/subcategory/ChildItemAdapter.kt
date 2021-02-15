package uz.uskunalar.uz.ui.category.subcategory

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.uskunalar.uz.R
import uz.uskunalar.uz.network.dto.MockData

class ChildItemAdapter : RecyclerView.Adapter<ChildItemAdapter.ChildViewHolder>() {

    val childList = MockData.getChildDataList()

    var onItemClick:((MockData.ChildItem)->Unit)? = null

    // This class is to initialize
    // the Views present
    // in the child RecyclerView
    inner class ChildViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var childItemTitle: TextView = itemView.findViewById(
            R.id.child_item_title
        )

        init {
            itemView.setOnClickListener {
                onItemClick?.invoke(childList[adapterPosition])
            }
        }

        fun bind(item: MockData.ChildItem) {
            val d = item

            childItemTitle.text = d.childItemTitle
        }

    }


    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        i: Int
    ): ChildViewHolder {
        val view =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.child_item, viewGroup, false)
        return ChildViewHolder(view)
    }

    override fun onBindViewHolder(
        childViewHolder: ChildViewHolder,
        position: Int
    ) = childViewHolder.bind(childList[position])

    override fun getItemCount() = childList.size



}