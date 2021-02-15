package uz.uskunalar.uz.ui.category.mainCategory

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_category_main.view.*
import uz.uskunalar.uz.R
import uz.uskunalar.uz.network.dto.MockData

class CategoryAdapter(val imageMore:Boolean = false) : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
    private val list = MockData.getCategoryDataList()

    var onItemClick: ((MockData.CategoryData) -> Unit)? = null

   inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val image = itemView.imageMore
        val line = itemView.textMainCategory


        init {
            itemView.setOnClickListener {
                onItemClick?.invoke(list[adapterPosition])
            }
        }

        fun bind(item: MockData.CategoryData) {
            val d = item

            image.setImageResource(d.image)
            line.text = d.name

            if (imageMore){
                image.visibility = View.GONE
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_category_main, parent, false
            )
        )

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(list[position])

}
