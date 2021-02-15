package uz.uskunalar.uz.ui.home.line

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_production_lines.view.*
import uz.uskunalar.uz.R
import uz.uskunalar.uz.network.dto.MockData

class LineAdapter : RecyclerView.Adapter<LineAdapter.ViewHolder>() {
    private val list = MockData.getLiniyaDataList()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val image = itemView.imageViewDiscount
        val line = itemView.textHomeLiniya
        val lineAbout = itemView.textHomeLiniyaAbout
        val cost = itemView.textHomeLiniyaCost
        val costSum = itemView.textHomeLiniyaCostSum


        fun bind(item: MockData.LiniyaData) {
            val d = item

            image.setImageResource(d.image)
            line.text = d.textLiniya
            lineAbout.text = d.textLiniyaAbout
            cost.text = d.textCost
            costSum.text = d.textCostSum

        }

        init {
            var k = 0
            itemView.frameLayoutHeart.setOnClickListener {
//                Toast.makeText(itemView.context, "fav clickes", Toast.LENGTH_SHORT).show()
                Log.d("ttt", " image_heart.setOnClickListener   ")
                k = (k + 1) % 2

                if (k == 1) {
                    itemView.skitkaHeartFull.visibility = View.VISIBLE
                    itemView.skitkaHeartEmpty.visibility = View.INVISIBLE
//                    Toast.makeText(itemView.context, "imgFull", Toast.LENGTH_SHORT).show()
                } else {
                    itemView.skitkaHeartFull.visibility = View.INVISIBLE
                    itemView.skitkaHeartEmpty.visibility = View.VISIBLE
//                    Toast.makeText(itemView.context, "imgEmpty", Toast.LENGTH_SHORT).show()
                    k = 0
                }
            }

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_production_lines, parent, false
            )
        )

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(list[position])

}