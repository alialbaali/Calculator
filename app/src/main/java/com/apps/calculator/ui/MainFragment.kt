package com.apps.calculator.ui


import android.app.Application
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.apps.calculator.R
import com.apps.calculator.database.CalculatorDatabase
import com.apps.calculator.databinding.FragmentMainBinding
import com.apps.calculator.viewModel.MainViewModel
import com.apps.calculator.viewModel.MainViewModelFactory

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var application: Application
    private lateinit var database: CalculatorDatabase
    private lateinit var mainViewModelFactory: MainViewModelFactory
    private lateinit var mainViewModel: MainViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // binding the layout with data binding
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        // setting up the View Model and the View Model Factory
        application = requireNotNull(this.activity).application
        // getting database instance
        database = CalculatorDatabase.getInstance(application)
        mainViewModelFactory = MainViewModelFactory(database.calculatorDao)
        mainViewModel =
            ViewModelProviders.of(this, mainViewModelFactory).get(MainViewModel::class.java)



        return binding.root
    }


}
