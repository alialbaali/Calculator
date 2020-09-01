package com.apps.calculator.databinding;
import com.apps.calculator.R;
import com.apps.calculator.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMainBindingImpl extends FragmentMainBinding implements com.apps.calculator.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tableRow, 19);
        sViewsWithIds.put(R.id.parenthesisButton, 20);
        sViewsWithIds.put(R.id.percentageButton, 21);
        sViewsWithIds.put(R.id.plusMinusButton, 22);
        sViewsWithIds.put(R.id.dotButton, 23);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private FragmentMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[17]
            , (android.widget.Button) bindings[13]
            , (android.widget.Button) bindings[14]
            , (android.widget.Button) bindings[15]
            , (android.widget.Button) bindings[9]
            , (android.widget.Button) bindings[10]
            , (android.widget.Button) bindings[11]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[7]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[23]
            , (android.widget.Button) bindings[18]
            , (android.widget.Button) bindings[12]
            , (android.widget.Button) bindings[8]
            , (android.widget.TextView) bindings[1]
            , (android.widget.Button) bindings[20]
            , (android.widget.Button) bindings[21]
            , (android.widget.Button) bindings[16]
            , (android.widget.Button) bindings[22]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TableRow) bindings[19]
            );
        this.button0.setTag(null);
        this.button1.setTag(null);
        this.button2.setTag(null);
        this.button3.setTag(null);
        this.button4.setTag(null);
        this.button5.setTag(null);
        this.button6.setTag(null);
        this.button7.setTag(null);
        this.button8.setTag(null);
        this.button9.setTag(null);
        this.clearButton.setTag(null);
        this.divisionButton.setTag(null);
        this.equalButton.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.minusButton.setTag(null);
        this.multiplyButton.setTag(null);
        this.operationView.setTag(null);
        this.plusButton.setTag(null);
        this.resultView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new com.apps.calculator.generated.callback.OnClickListener(this, 15);
        mCallback13 = new com.apps.calculator.generated.callback.OnClickListener(this, 13);
        mCallback11 = new com.apps.calculator.generated.callback.OnClickListener(this, 11);
        mCallback8 = new com.apps.calculator.generated.callback.OnClickListener(this, 8);
        mCallback6 = new com.apps.calculator.generated.callback.OnClickListener(this, 6);
        mCallback4 = new com.apps.calculator.generated.callback.OnClickListener(this, 4);
        mCallback2 = new com.apps.calculator.generated.callback.OnClickListener(this, 2);
        mCallback16 = new com.apps.calculator.generated.callback.OnClickListener(this, 16);
        mCallback14 = new com.apps.calculator.generated.callback.OnClickListener(this, 14);
        mCallback12 = new com.apps.calculator.generated.callback.OnClickListener(this, 12);
        mCallback10 = new com.apps.calculator.generated.callback.OnClickListener(this, 10);
        mCallback9 = new com.apps.calculator.generated.callback.OnClickListener(this, 9);
        mCallback7 = new com.apps.calculator.generated.callback.OnClickListener(this, 7);
        mCallback5 = new com.apps.calculator.generated.callback.OnClickListener(this, 5);
        mCallback3 = new com.apps.calculator.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.apps.calculator.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.mainViewModel == variableId) {
            setMainViewModel((com.apps.calculator.viewmodel.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMainViewModel(@Nullable com.apps.calculator.viewmodel.MainViewModel MainViewModel) {
        this.mMainViewModel = MainViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.mainViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMainViewModelOperation((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeMainViewModelResult((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMainViewModelOperation(androidx.lifecycle.MutableLiveData<java.lang.String> MainViewModelOperation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMainViewModelResult(androidx.lifecycle.MutableLiveData<java.lang.String> MainViewModelResult, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.apps.calculator.viewmodel.MainViewModel mainViewModel = mMainViewModel;
        java.lang.String mainViewModelOperationGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> mainViewModelOperation = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> mainViewModelResult = null;
        java.lang.String mainViewModelResultGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (mainViewModel != null) {
                        // read mainViewModel.operation
                        mainViewModelOperation = mainViewModel.getOperation();
                    }
                    updateLiveDataRegistration(0, mainViewModelOperation);


                    if (mainViewModelOperation != null) {
                        // read mainViewModel.operation.getValue()
                        mainViewModelOperationGetValue = mainViewModelOperation.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (mainViewModel != null) {
                        // read mainViewModel.result
                        mainViewModelResult = mainViewModel.getResult();
                    }
                    updateLiveDataRegistration(1, mainViewModelResult);


                    if (mainViewModelResult != null) {
                        // read mainViewModel.result.getValue()
                        mainViewModelResultGetValue = mainViewModelResult.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.button0.setOnClickListener(mCallback15);
            this.button1.setOnClickListener(mCallback11);
            this.button2.setOnClickListener(mCallback12);
            this.button3.setOnClickListener(mCallback13);
            this.button4.setOnClickListener(mCallback7);
            this.button5.setOnClickListener(mCallback8);
            this.button6.setOnClickListener(mCallback9);
            this.button7.setOnClickListener(mCallback3);
            this.button8.setOnClickListener(mCallback4);
            this.button9.setOnClickListener(mCallback5);
            this.clearButton.setOnClickListener(mCallback1);
            this.divisionButton.setOnClickListener(mCallback2);
            this.equalButton.setOnClickListener(mCallback16);
            this.minusButton.setOnClickListener(mCallback10);
            this.multiplyButton.setOnClickListener(mCallback6);
            this.plusButton.setOnClickListener(mCallback14);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.operationView, mainViewModelOperationGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.resultView, mainViewModelResultGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 15: {
                // localize variables for thread safety
                // mainViewModel
                com.apps.calculator.viewmodel.MainViewModel mainViewModel = mMainViewModel;
                // mainViewModel != null
                boolean mainViewModelJavaLangObjectNull = false;



                mainViewModelJavaLangObjectNull = (mainViewModel) != (null);
                if (mainViewModelJavaLangObjectNull) {



                    mainViewModel.onClick(callbackArg_0);
                }
                break;
            }
            case 13: {
                // localize variables for thread safety
                // mainViewModel
                com.apps.calculator.viewmodel.MainViewModel mainViewModel = mMainViewModel;
                // mainViewModel != null
                boolean mainViewModelJavaLangObjectNull = false;



                mainViewModelJavaLangObjectNull = (mainViewModel) != (null);
                if (mainViewModelJavaLangObjectNull) {



                    mainViewModel.onClick(callbackArg_0);
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // mainViewModel
                com.apps.calculator.viewmodel.MainViewModel mainViewModel = mMainViewModel;
                // mainViewModel != null
                boolean mainViewModelJavaLangObjectNull = false;



                mainViewModelJavaLangObjectNull = (mainViewModel) != (null);
                if (mainViewModelJavaLangObjectNull) {



                    mainViewModel.onClick(callbackArg_0);
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // mainViewModel
                com.apps.calculator.viewmodel.MainViewModel mainViewModel = mMainViewModel;
                // mainViewModel != null
                boolean mainViewModelJavaLangObjectNull = false;



                mainViewModelJavaLangObjectNull = (mainViewModel) != (null);
                if (mainViewModelJavaLangObjectNull) {



                    mainViewModel.onClick(callbackArg_0);
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // mainViewModel
                com.apps.calculator.viewmodel.MainViewModel mainViewModel = mMainViewModel;
                // mainViewModel != null
                boolean mainViewModelJavaLangObjectNull = false;



                mainViewModelJavaLangObjectNull = (mainViewModel) != (null);
                if (mainViewModelJavaLangObjectNull) {



                    mainViewModel.onClick(callbackArg_0);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // mainViewModel
                com.apps.calculator.viewmodel.MainViewModel mainViewModel = mMainViewModel;
                // mainViewModel != null
                boolean mainViewModelJavaLangObjectNull = false;



                mainViewModelJavaLangObjectNull = (mainViewModel) != (null);
                if (mainViewModelJavaLangObjectNull) {



                    mainViewModel.onClick(callbackArg_0);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // mainViewModel
                com.apps.calculator.viewmodel.MainViewModel mainViewModel = mMainViewModel;
                // mainViewModel != null
                boolean mainViewModelJavaLangObjectNull = false;



                mainViewModelJavaLangObjectNull = (mainViewModel) != (null);
                if (mainViewModelJavaLangObjectNull) {



                    mainViewModel.onClick(callbackArg_0);
                }
                break;
            }
            case 16: {
                // localize variables for thread safety
                // mainViewModel
                com.apps.calculator.viewmodel.MainViewModel mainViewModel = mMainViewModel;
                // mainViewModel != null
                boolean mainViewModelJavaLangObjectNull = false;



                mainViewModelJavaLangObjectNull = (mainViewModel) != (null);
                if (mainViewModelJavaLangObjectNull) {


                    mainViewModel.onEqual();
                }
                break;
            }
            case 14: {
                // localize variables for thread safety
                // mainViewModel
                com.apps.calculator.viewmodel.MainViewModel mainViewModel = mMainViewModel;
                // mainViewModel != null
                boolean mainViewModelJavaLangObjectNull = false;



                mainViewModelJavaLangObjectNull = (mainViewModel) != (null);
                if (mainViewModelJavaLangObjectNull) {



                    mainViewModel.onClick(callbackArg_0);
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // mainViewModel
                com.apps.calculator.viewmodel.MainViewModel mainViewModel = mMainViewModel;
                // mainViewModel != null
                boolean mainViewModelJavaLangObjectNull = false;



                mainViewModelJavaLangObjectNull = (mainViewModel) != (null);
                if (mainViewModelJavaLangObjectNull) {



                    mainViewModel.onClick(callbackArg_0);
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // mainViewModel
                com.apps.calculator.viewmodel.MainViewModel mainViewModel = mMainViewModel;
                // mainViewModel != null
                boolean mainViewModelJavaLangObjectNull = false;



                mainViewModelJavaLangObjectNull = (mainViewModel) != (null);
                if (mainViewModelJavaLangObjectNull) {



                    mainViewModel.onClick(callbackArg_0);
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // mainViewModel
                com.apps.calculator.viewmodel.MainViewModel mainViewModel = mMainViewModel;
                // mainViewModel != null
                boolean mainViewModelJavaLangObjectNull = false;



                mainViewModelJavaLangObjectNull = (mainViewModel) != (null);
                if (mainViewModelJavaLangObjectNull) {



                    mainViewModel.onClick(callbackArg_0);
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // mainViewModel
                com.apps.calculator.viewmodel.MainViewModel mainViewModel = mMainViewModel;
                // mainViewModel != null
                boolean mainViewModelJavaLangObjectNull = false;



                mainViewModelJavaLangObjectNull = (mainViewModel) != (null);
                if (mainViewModelJavaLangObjectNull) {



                    mainViewModel.onClick(callbackArg_0);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // mainViewModel
                com.apps.calculator.viewmodel.MainViewModel mainViewModel = mMainViewModel;
                // mainViewModel != null
                boolean mainViewModelJavaLangObjectNull = false;



                mainViewModelJavaLangObjectNull = (mainViewModel) != (null);
                if (mainViewModelJavaLangObjectNull) {



                    mainViewModel.onClick(callbackArg_0);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // mainViewModel
                com.apps.calculator.viewmodel.MainViewModel mainViewModel = mMainViewModel;
                // mainViewModel != null
                boolean mainViewModelJavaLangObjectNull = false;



                mainViewModelJavaLangObjectNull = (mainViewModel) != (null);
                if (mainViewModelJavaLangObjectNull) {



                    mainViewModel.onClick(callbackArg_0);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // mainViewModel
                com.apps.calculator.viewmodel.MainViewModel mainViewModel = mMainViewModel;
                // mainViewModel != null
                boolean mainViewModelJavaLangObjectNull = false;



                mainViewModelJavaLangObjectNull = (mainViewModel) != (null);
                if (mainViewModelJavaLangObjectNull) {


                    mainViewModel.onClear();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mainViewModel.operation
        flag 1 (0x2L): mainViewModel.result
        flag 2 (0x3L): mainViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}