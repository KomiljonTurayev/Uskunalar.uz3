package uz.uskunalar.uz.ui.home.articles

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_articles.view.*
import uz.uskunalar.uz.R
import uz.uskunalar.uz.network.dto.MockData

class ArticlesAdapter : RecyclerView.Adapter<ArticlesAdapter.ViewHolder>() {

    private val list = MockData.getArtictDataList()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val image = itemView.imageOurWork
        val textOurWorkData = itemView.textOurWorkData
        val textOurWork = itemView.textOurWork


        fun bind(item: MockData.ArtictData) {
            val d = item

            image.setImageResource(d.image)
            textOurWorkData.text = d.data
            textOurWork.text = d.name

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticlesAdapter.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_articles, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ArticlesAdapter.ViewHolder, position: Int) =
        holder.bind(list[position])
}