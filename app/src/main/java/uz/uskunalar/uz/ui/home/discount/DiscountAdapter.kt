package uz.uskunalar.uz.ui.home.discount

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_discount.view.*
import uz.uskunalar.uz.R
import uz.uskunalar.uz.network.dto.MockData

class DiscountAdapter(val oldCost: Boolean = false, val discount: Boolean = false) :
    RecyclerView.Adapter<DiscountAdapter.ViewHolder>() {

    private val list = MockData.getDiscountDataList()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        val image = itemView.imageViewDiscount
        val product = itemView.textHomeLiniya
        val productAbout = itemView.textHomeLiniyaAbout
        val cost = itemView.textHomeLiniyaCost
        val costOld = itemView.textHomeLiniyaCost
        val costSum = itemView.textHomeLiniyaCostSum


        fun bind(item: MockData.DiscountData) {
            val d = item

            image.setImageResource(d.image)
            product.text = d.product
            productAbout.text = d.productAbout
            cost.text = d.cost
            costOld.text = d.costOld
            costSum.text = d.costSum

            if (discount) {
                itemView.text_wish.visibility = View.GONE
            }
            if (oldCost) {
                itemView.textHomeLiniyaCostOld.visibility = View.INVISIBLE
            }

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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscountAdapter.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_discount, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: DiscountAdapter.ViewHolder, position: Int) =
        holder.bind(list[position])
}