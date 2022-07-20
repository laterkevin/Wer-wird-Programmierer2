package de.syntax_institut.funappsvorlage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import de.syntax_institut.funappsvorlage.databinding.ActivityMainBinding

/**
 * Main Activity, dient als Einstiegspunkt für die App
 */
class MainActivity : AppCompatActivity() {

    /* -------------------- Klassen Variablen -------------------- */

    // Verknüpft die XML Elemente mit der Klasse
    private lateinit var binding: ActivityMainBinding

    /* -------------------- Lifecycle -------------------- */

    /**
     * Lifecycle Funktion, wird aufgerufen wenn Activity erstellt wird
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Das Binding zur XML-Datei
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
