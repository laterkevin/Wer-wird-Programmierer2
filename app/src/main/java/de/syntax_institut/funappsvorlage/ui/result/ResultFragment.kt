package de.syntax_institut.funappsvorlage.ui.result

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import de.syntax_institut.funappsvorlage.R
import de.syntax_institut.funappsvorlage.databinding.FragmentResultBinding

/**
 * Diese Klasse kümmert sich um die richtige Darstellung von UI Elementen.
 */
class ResultFragment : Fragment() {

    // Hier wird das ViewModel, in dem die Logik stattfindet, geholt
    private val viewModel: ResultViewModel by viewModels()

    // Das binding für das QuizFragment wird deklariert
    private lateinit var binding: FragmentResultBinding

    /**
     * Lifecycle Funktion onCreateView
     * Hier wird das binding initialisiert und das Layout gebaut
     */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_result, container, false)
        return binding.root
    }

    /**
     * Lifecycle Funktion onViewCreated
     * Hier werden die Elemente eingerichtet und z.B. onClickListener gesetzt
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewmodel = viewModel

        binding.lifecycleOwner = viewLifecycleOwner

        // Wenn das Spiel neu gestartet werden soll
        binding.tvPlayAgain.setOnClickListener {
            findNavController().navigate(ResultFragmentDirections.actionResultFragmentToQuizFragment())
        }

        // Wenn die App beendet werden soll
        binding.tvExit.setOnClickListener {
            activity?.finish()
        }
    }
}
