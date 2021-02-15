package uz.uskunalar.uz.ui.category.subcategory.subsubcategory

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.fragment_sub_category.*
import kotlinx.android.synthetic.main.fragment_sub_category.view.*
import uz.uskunalar.uz.MainActivity
import uz.uskunalar.uz.R
import uz.uskunalar.uz.ui.home.discount.DiscountAdapter

class SubCategoryFragment : Fragment() {


    lateinit var mainActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sub_category, container, false)
    }

    fun onCreateDialog(savedInstanceState: Bundle?): Dialog? {
        return BottomSheetDialog(requireContext(), R.style.MyTransparentBottomSheetDialogTheme)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imageViewGrid.setImageResource(R.drawable.ic_shape_grid_1x)

        var recyclerDiscount = view.findViewById<RecyclerView>(R.id.recyclerSubCategory)

        recyclerDiscount.layoutManager =
            GridLayoutManager(activity, 2)

        val mAdapterDiscount = DiscountAdapter(true, true)
        recyclerDiscount.adapter = mAdapterDiscount

        var i = 0
        imageViewGrid.setOnClickListener {

            when (i) {
                0 -> {

                    imageViewGrid.setImageResource(R.drawable.ic_shape_grid_1x_2)

                    recyclerDiscount = view.findViewById<RecyclerView>(R.id.recyclerSubCategory)

                    recyclerDiscount.layoutManager =
                        LinearLayoutManager(activity)

                    val mAdapterDiscount = SubCategoryAdapter(true, true)
                    recyclerDiscount.adapter = mAdapterDiscount


                    i = 1

                }

                1 -> {
                    i = 0
                    imageViewGrid.setImageResource(R.drawable.ic_shape_grid_1x)

                    recyclerDiscount = view.findViewById<RecyclerView>(R.id.recyclerSubCategory)

                    recyclerDiscount.layoutManager =
                        GridLayoutManager(activity, 2)

                    val mAdapterDiscount = DiscountAdapter(true, true)
                    recyclerDiscount.adapter = mAdapterDiscount

                }
                else -> {
                    i = 0
                    imageViewGrid.setImageResource(R.drawable.ic_shape_grid_1x_2)

                    recyclerDiscount = view.findViewById<RecyclerView>(R.id.recyclerSubCategory)

                    recyclerDiscount.layoutManager =
                        GridLayoutManager(activity, 2)

                    val mAdapterDiscount = SubCategoryAdapter(true, true)
                    recyclerDiscount.adapter = mAdapterDiscount
                }
            }
        }

        view.bottomSheetDialogFragmentBtn.setOnClickListener {
            showListDialog()
        }

        mainActivity = requireActivity() as MainActivity
        view.textViewFiltr.setOnClickListener {

            mainActivity.openDrawer()

            Toast.makeText(requireContext(), "Drawer", Toast.LENGTH_SHORT).show()
        }
    }

    private fun showListDialog() {
        val dialog =
            ModalBottomSheet()

        //fragmentManager?.let { dialog.show(it, "example2") }
        dialog.show(childFragmentManager, "diLOG")
    }

}