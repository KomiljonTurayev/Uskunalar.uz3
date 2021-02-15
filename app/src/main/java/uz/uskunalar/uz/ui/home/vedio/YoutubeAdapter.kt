package uz.uskunalar.uz.ui.home.vedio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.video_per_row.view.*
import uz.uskunalar.uz.R
import uz.uskunalar.uz.network.dto.MockData

class YoutubeAdapter() : RecyclerView.Adapter<YoutubeAdapter.YoutubeViewHolder>() {
    val data = MockData.getDataSetListList()

    class YoutubeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var webView: WebView = itemView.findViewById(R.id.video_view)
        var text = itemView.youtube_video_text
        var textData = itemView.youtube_video_textData

        init {
            webView.webViewClient = WebViewClient()
            webView.webChromeClient = WebChromeClient()
            webView.settings.javaScriptEnabled = true
        }

        fun bind(item: MockData.DataSetList) {

            itemView.apply {
                val d = item

                webView.loadUrl(d.link!!)
                text.text = item.text
                textData.text = item.data

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YoutubeViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.video_per_row, parent, false)
        return YoutubeViewHolder(view)
    }

    override fun onBindViewHolder(holder: YoutubeViewHolder, position: Int) =
        holder.bind(data[position])

    override fun getItemCount() = data.size

}