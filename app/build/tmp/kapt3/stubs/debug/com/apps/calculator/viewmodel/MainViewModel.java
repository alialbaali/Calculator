package com.apps.calculator.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/apps/calculator/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "dao", "Lcom/apps/calculator/database/CalculatorDao;", "(Lcom/apps/calculator/database/CalculatorDao;)V", "job", "Lkotlinx/coroutines/Job;", "operation", "Landroidx/lifecycle/MutableLiveData;", "", "getOperation", "()Landroidx/lifecycle/MutableLiveData;", "result", "getResult", "scope", "Lkotlinx/coroutines/CoroutineScope;", "calculate", "", "onClear", "onClick", "v", "Landroid/view/View;", "onEqual", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> operation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> result = null;
    private final kotlinx.coroutines.Job job = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private final com.apps.calculator.database.CalculatorDao dao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getOperation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getResult() {
        return null;
    }
    
    public final void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public final void onEqual() {
    }
    
    private final void calculate() {
    }
    
    public final void onClear() {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.apps.calculator.database.CalculatorDao dao) {
        super();
    }
}