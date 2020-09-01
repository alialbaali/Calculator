package com.apps.calculator.ui


import android.app.Application
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.apps.calculator.R
import com.apps.calculator.database.CalculatorDao
import com.apps.calculator.database.CalculatorDatabase
import com.apps.calculator.databinding.FragmentMainBinding
import com.apps.calculator.viewmodel.MainViewModel
import com.apps.calculator.viewmodel.MainViewModelFactory

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var mainViewModel: MainViewModel
    private lateinit var application: Application
    private lateinit var mainViewModelFactory: MainViewModelFactory
    private lateinit var dao: CalculatorDao

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        application = requireNotNull(this.activity).application
        dao = CalculatorDatabase.getInstance(application).calculatorDao
        mainViewModelFactory = MainViewModelFactory(dao)
        mainViewModel =
            ViewModelProviders.of(this, mainViewModelFactory).get(MainViewModel::class.java)
        binding.mainViewModel = mainViewModel
        binding.lifecycleOwner = this



        return binding.root
    }


}
