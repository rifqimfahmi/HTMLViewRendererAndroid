package renotekno.com.htmltagextracter;

import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<View>>{

    private String html = "<div style=\"text-align: center;\"> <b><span style=\"font-family: &quot;trebuchet ms&quot; , sans-serif; font-size: x-large;\">Penalty Algoritma Panda</span></b></div> <div class=\"separator\" style=\"clear: both; text-align: center;\"> <img border=\"0\" height=\"287\" src=\"https://3.bp.blogspot.com/-TNUC9R7KD_Y/V_4Kl4k5TxI/AAAAAAAAAHA/BqpajYpXqmElnB8jECMRzC3hILv-OaHogCEw/s400/google%2Bpanda.jpg\" width=\"400\" /></div> <div style=\"text-align: left;\"> Salam ind45-Ya setelah saya membahas tentang <a href=\"http://ind45.blogspot.co.id/2016/10/algoritma-google.html\" rel=\"nofollow\" target=\"_blank\">Algoritma Google</a>. Ternyata dari salah satu Algoritma ini mempunyai Hukuman, yaitu hukuman Algoritma Panda. Ok sebelum kita membahas tentang bagaimana <a href=\"http://ind45.blogspot.co.id/2016/10/cara-mengatasi-hukuman-algoritma-google.html\" rel=\"nofollow\" target=\"_blank\">cara keluar dari hukuman Google Panda.</a><br /> <br /> Ok guys bagi anda yang sudah lama bermain di sunia SEO pasti anda akan bisa melihat pada akhir bulan mei yang lalu ada banyak sekali website yang jatuh peringkatnya, tapi tidak kalah dengan peringkat yang naik. Jadi inilah gambaran dasar bahwa era SEO saat ini kita tidak bisa mengabaikan onpage, karna onpage bisa membuat ranking website anda meroket bahkan terjungkal begitu saja<br /> <br /> Jadi bagi yang ingin melakukan <a href=\"http://ind45.blogspot.co.id/2016/10/apa-itu-seo.html\" rel=\"nofollow\" target=\"_blank\">SEO </a>anda 100% wajib memperbaiki onpage dan offpage.<br /> Saya tidak akan membahas secara detail masalah onpage dan offpage disini, karna sangat panjang dan membutuhkan waktu yang sangat lama. Tidak perlu khawatir karna panda tidak menyerang atau membanting halaman -halaman hanya karna struktur yang tidak maksimal. Panda hanya membanting<br /> halaman-halaman yang strukturnya jelas tidak sesuai dengan standar teknis Google dan positif melakukan spam pada onpagenya.<br /> <b><span style=\"font-size: x-large;\"><br /></span></b> <br /> <h4> <b><span style=\"font-family: &quot;georgia&quot; , &quot;times new roman&quot; , serif; font-size: large;\">Hal Apa Yang Harus Diperbaiki Untuk Keluar Sanksi Google Panda</span></b></h4> <div> Ya tentunya jika anda merasa terkena pukulan dari panda, anda sudah bosan dari hukuman tersebut dan ingin keluar dari hukuman panda? Tapi satu hal yang harus anda ketahui diantaranya:memperbaiki onpage itu relatif lebih mudah dari pada offpage. Hanya saja anda harus paham teknik pelaksanaanya seperti apa. Ok langsung aja ya guys, di bwah adalah hal hal yang harus anda perhatikan dari halaman web yang anda miliki</div> <div> <br /></div> <div> <ul> <li>Apakah konten anda berkualitas dan memang bisa menolong orang lain atau hanya sekedar hobi dan basa-basi untuk meroketkan jumlah halaman? Kalau anda bisa menilai dengan jujur. Maka itu akan menolong anda pada saat ini</li> <li>Apakah anda melakukan over optimization(optimasi yang berlebihan). Ya barangkali dengan begitu banyaknya kata kunci di halaman anda? Atau terlalu banyak konten yang membahas hal-hal itu saja atau konten yang anda buat tidak unik atau tidak berkualitas</li> <li>Periksa juga apakah anda sudah melakukan teknik webspam yang disebut Doorway Pages?&nbsp;</li> <li>Cek juga apakah konten anda mempunyai masalah duplikat? Ya sebagai contohnya duplikat ialah 2 halaman atau lebih di halaman web anda yang sangat percis</li> <li>Susunlah sistem kategori anda yang rapih, jangan anda menjadikan kategore atau tegging sebagai alat menumpuk pada kata kunci</li> <li>Pertimbangkan untuk menjadi mobile friendly dengam memakai template yang responsif, karna dengan template yang bagus serta unik para pengunjung atau para pembaca juga senang akan keiindahan blog yang anda miliki. Ini juga masih menjadi PR bagi saya untuk mengedit template blog ini agar lebih unik dan menarik</li> <li>Berhenti mencuri konten orang lain dan jika ada konten curian segera dihapus. Konten yang diminta baik-baik untuk &nbsp;dihapus karena intinya itu sangat merugikan anda karna membuat website anda terlihat low quality content.</li> <li>Ok guys dari sekian pembahasan kita diatas apa ada hal yang harus kalian perbaiki? kalau terlalu banyak masalah yang harus anda perbaiki, menurut saran saya sebaiknya desain ulang website anda.</li> </ul> Ya jadi itulah hal yang harus anda perhatikan dalam era Panda terbaru saat ini. Setidaknga setelah membandingkan beberapa halaman yang terkena kenaikan ataupun penurunan grafik. Mudah mudahan saya disini memberikan manfaat bagi yang sudah membaca dan blog anda segera pulih setelah kunjungan Googlebot.&nbsp;</div> </div> ";
    // a viewGroup of the layout
    private LinearLayout linearLayoutViewGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        // start loader to load post
        Bundle bundle = new Bundle();
        bundle.putString(Data.POST_CONTENT_TAG_BUNDLE, html);
        getSupportLoaderManager().initLoader(Data.LOADER_CREATE_VIEWS, bundle, this);
    }

    private void inflateView(List<View> viewsComponents) {
        Log.d("VIEWS_SIZE", viewsComponents.size() + "");
        // keep track of the image URL arrays index if exist start with 0
        int imageIndex = 0;
        // check if the views arrays is not null
        if (viewsComponents.size() > 0){
            // loop through each view to inflate it to the viewgroup
            for (int i = 0; i < viewsComponents.size(); i++) {
                View view = viewsComponents.get(i);

                // if the view is instance of ImageView start loading image from the URL with glide
                if (view instanceof ImageView) {
                    Glide.with(MainActivity.this).load(Data.imagesSrc.get(imageIndex)).into((ImageView) view);

                    // Increase image index position to be corresponded with the images URL array index
                    imageIndex++;
                }

                // inflate the view to the viewgroup
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                linearLayoutViewGroup.addView(view);
            }
        }
    }

    private void initView() {
        linearLayoutViewGroup = (LinearLayout) findViewById(R.id.linearLayoutViewGroup);
    }

    /***
     * Loader interface callbacks start
     */
    @Override
    public Loader<List<View>> onCreateLoader(int id, Bundle args) {
        // create new loader instance @ContentLoader class
        return new ContentLoader(MainActivity.this, args.getString(Data.POST_CONTENT_TAG_BUNDLE));
    }

    @Override
    public void onLoadFinished(Loader<List<View>> loader, List<View> viewsComponents) {
        // Loader has finish creating array of views
        // If the view array is not null and the size > 0 inflate the view
        if (viewsComponents != null && viewsComponents.size() > 0) {
            inflateView(viewsComponents);
        }
    }

    @Override
    public void onLoaderReset(Loader<List<View>> loader) {

    }
    /***
     * Loader interface callbacks End
     */

}
