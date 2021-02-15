package uz.uskunalar.uz

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.core.view.isGone
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavOptions
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import uz.uskunalar.uz.ui.filter.DrawerFragment
import uz.uskunalar.uz.util.NavigationUIHelper

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var bottomNavView: BottomNavigationView

    lateinit var drawer: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(false)

        drawer = findViewById(R.id.drawer_layout)



        bottomNavView = findViewById(R.id.bottom_nav_view)
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: BottomNavigationView = findViewById(R.id.bottom_nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_category,
                R.id.nav_favourite, R.id.nav_settings
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            when (destination.id) {
                R.id.nav_auth -> {
                    toolbar.isGone = true
                    bottomNavView.isGone = true
                }
                R.id.nav_home -> {
                    toolbar.isGone = false
                    bottomNavView.isGone = false
                }

                R.id.nav_sub_category -> {
                    toolbar.isGone = true
                    bottomNavView.isGone = false

//                    (drawer as DrawerFragment).changePage(0)
                }
                else -> supportActionBar?.show()
            }
        }


//        bottomNavView.setOnNavigationItemSelectedListener { item: MenuItem ->
//            val builder = NavOptions.Builder()
//                .setLaunchSingleTop(true)
//            when (item.title) {
////                "_" -> drawerLayout.openDrawer(GravityCompat.START)
//                "menu_home" -> {
//                    navController.navigate(R.id.nav_home)
//                }
//                "menu_category" -> {
////                    navController.popBackStack()
//                    navController.navigate(R.id.nav_category)
//                }
//                "favourite" -> {
//                    navController.navigate(R.id.nav_favourite)
//                }
//
//                "menu_settings" -> {
//                    navController.navigate(R.id.nav_settings)
//                }
//
//                else -> {
//                    navController.navigate(R.id.nav_home)
//                }
//            }
//            NavigationUIHelper.onNavDestinationSelected(item, navController, builder)
//            true
//        }
    }

    fun openDrawer() {
        drawer.openDrawer(GravityCompat.END)

//        activity.getActionBar().setTitle("Select content");
//        activity.invalidateOptionsMenu();
        drawer.bringToFront();
    }
    fun closeDrawer() {
        drawer.closeDrawer(GravityCompat.END)
    }

//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        menuInflater.inflate(R.menu.main, menu)
//        return true
//    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}