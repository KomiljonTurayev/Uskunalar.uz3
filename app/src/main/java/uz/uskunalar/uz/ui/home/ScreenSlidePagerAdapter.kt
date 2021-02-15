package uz.uskunalar.uz.ui.home
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ScreenSlidePagerAdapter(activity: Fragment) : FragmentStateAdapter(activity) {

    var lists = ArrayList<Fragment>()

    fun update(list : ArrayList<Int>)
    {
       list.forEach {
           lists.add(ViewPager2TopFragment.newInstance(it))

           Log.i("pagerr","adding")
       }
        notifyDataSetChanged()
    }

    override fun createFragment(position: Int): Fragment {

        return lists[position]
    }

    override fun getItemCount(): Int = lists.size
}