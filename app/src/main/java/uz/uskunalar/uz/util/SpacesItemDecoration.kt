package com.example.kidya_example.util

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class SpacesItemDecoration(private val space: Int,private val vertical: Boolean=true,private val span:Int=2) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)

        if(vertical)
        {
            var itemposition=parent.getChildLayoutPosition(view)
            var column= itemposition%span

            outRect.left = space-column* space/span
            outRect.right = (column+1)* space/span
            outRect.bottom = space

            if (itemposition < span ) {
                outRect.top = space
            } else {
                outRect.top = 0
            }
        }
        else
        {
            var itemposition=parent.getChildLayoutPosition(view)

            outRect.top = space
            outRect.bottom = space
            outRect.right=space

            if (itemposition == 0) {
                outRect.left = space
            } else {
                outRect.left = 0
            }
        }

    }
}