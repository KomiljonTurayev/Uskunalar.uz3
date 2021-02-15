package uz.uskunalar.uz.ui.home.our_work

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_our_work.view.*
import uz.uskunalar.uz.R
import uz.uskunalar.uz.network.dto.MockData

class OurWorkAdapter : RecyclerView.Adapter<OurWorkAdapter.ViewHolder>() {
    private val list = MockData.getOurWorkDataList()

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val image = itemView.imageOurWork
        val textOurWork = itemView.textOurWork


        fun bind(item: MockData.OurWorkData) {
            val d = item

            image.setImageResource(d.image)
            textOurWork.text = d.name

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_our_work, parent, false
            )
        )

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(list[position])

}
