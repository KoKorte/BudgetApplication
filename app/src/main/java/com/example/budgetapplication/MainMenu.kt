import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
    }

    fun addPlan(view: View) {
        // TODO: Implement add plan functionality
    }

    fun viewSavedPlans(view: View) {
        // TODO: Implement view saved plans functionality
    }

    fun viewChart(view: View) {
        // TODO: Implement view chart functionality
    }

    fun quit(view: View) {
        finish()
    }
}