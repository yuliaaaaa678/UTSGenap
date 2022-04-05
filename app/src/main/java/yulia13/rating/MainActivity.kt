//ini adalah nama paketnya
package yulia13.rating

//mengimport interface untuk kelas MainActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

//membuat kelas MainActivity
class MainActivity : AppCompatActivity() {
    //method untuk menampilkan halaman MainActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //method untuk berpindah halaman ketika tombol "selesai" di klik
    fun submit(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}