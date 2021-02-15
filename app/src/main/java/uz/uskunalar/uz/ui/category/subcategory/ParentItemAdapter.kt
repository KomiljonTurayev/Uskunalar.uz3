package uz.uskunalar.uz.ui.category.subcategory

import android.graphics.Typeface
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.TranslateAnimation
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import kotlinx.android.synthetic.main.parent_item.view.*
import uz.uskunalar.uz.R
import uz.uskunalar.uz.network.dto.MockData


class ParentItemAdapter : RecyclerView.Adapter<ParentItemAdapter.ParentViewHolder>() {

    val parentList = MockData.getParentItemList()

    private val viewPool = RecycledViewPool()

    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        i: Int
    ) = ParentViewHolder(
        LayoutInflater.from(viewGroup.context).inflate(R.layout.parent_item, viewGroup, false)
    )

    override fun onBindViewHolder(parentViewHolder: ParentViewHolder, position: Int) =
        parentViewHolder.bind(parentList[position])

    override fun getItemCount() = parentList.size

    // This class is to initialize
    // the Views present in
    // the parent RecyclerView
    inner class ParentViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        val parentItemTitle: TextView = itemView.findViewById(R.id.parent_item_title)
        val childRecyclerView: RecyclerView = itemView.findViewById(R.id.child_recyclerview)
        val childItemAdapter = ChildItemAdapter()
//        val type: Typeface = Typeface.createFromAsset();


        init {

            childItemAdapter.onItemClick = {
                Toast.makeText(itemView.context, "$it", Toast.LENGTH_SHORT).show()
                itemView.findNavController().navigate(R.id.nav_sub_category)
            }

            var i = 0
            itemView.parent_item.setOnClickListener {
                Toast.makeText(itemView.context, "${it.id}", Toast.LENGTH_SHORT).show()

//                itemView.parent_item_title.tex
                Log.d("ttt", " itemView.setOnClickListener   ")

                i = (i + 1) % 2
                if (i == 1) {
                    childRecyclerView.visibility = View.VISIBLE

                    itemView.parent_item_title.typeface = Typeface.SANS_SERIF; //only font style
                    itemView.parent_item_title.setTypeface(
                        null,
                        Typeface.BOLD
                    ); //only text style(only bold)
//                    itemView.parent_item_title.setTypeface(null,Typeface.BOLD_ITALIC); //only text style(bold & italic)
//                    itemView.parent_item_title.setTypeface(Typeface.SANS_SERIF,Typeface.BOLD);
//                    itemView.parent_item_title.yle & text style(only bold)
//                    itemView.parent_item_title.setTypeface(Typeface.SANS_SERIF,Typeface.BOLD_ITALIC);
                    //font style & text style(bold & italic)

                    itemView.imageMore.setImageResource(R.drawable.ic_arrow_ios_up)

                } else {
                    childRecyclerView.visibility = View.GONE
                    i = 0

                    itemView.imageMore.setImageResource(R.drawable.ic_arrow_ios_down)
                    itemView.parent_item_title.typeface = Typeface.SANS_SERIF; //only font style

                }

            }
        }


        fun bind(item: MockData.ParentItem) {
            val d = item
            parentItemTitle.text = d.parentItemTitle


//            // Here we have assigned the layout
//            // as LinearLayout with vertical orientation
            val layoutManager = LinearLayoutManager(
                itemView.context,
                LinearLayoutManager.VERTICAL,
                false
            )



            childRecyclerView.layoutManager = layoutManager
            childRecyclerView.adapter = childItemAdapter
            childRecyclerView.setRecycledViewPool(viewPool)


        }
    }
}


