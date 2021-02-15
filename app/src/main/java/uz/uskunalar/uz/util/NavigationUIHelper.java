package uz.uskunalar.uz.util;

import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavOptions;

public class NavigationUIHelper {
    public static boolean onNavDestinationSelected(@NonNull MenuItem item,
                                                   @NonNull NavController navController,
                                                   @NonNull NavOptions.Builder builder) {
        if ((item.getOrder() & Menu.CATEGORY_SECONDARY) == 0) {
            NavDestination destination = findStartDestination(navController.getGraph());
            builder.setPopUpTo(destination.getId(), false);
        }
        NavOptions options = builder.build();
        try {
            navController.navigate(item.getItemId(), null, options);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    // Need to copy this private method as well
    private static NavDestination findStartDestination(@NonNull NavGraph graph) {
        NavDestination startDestination = graph;
        while (startDestination instanceof NavGraph) {
            NavGraph parent = (NavGraph) startDestination;
            startDestination = parent.findNode(parent.getStartDestination());
        }
        return startDestination;
    }
}
