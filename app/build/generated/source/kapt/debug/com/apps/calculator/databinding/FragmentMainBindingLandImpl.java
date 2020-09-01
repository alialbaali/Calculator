package com.apps.calculator.databinding;
import com.apps.calculator.R;
import com.apps.calculator.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMainBindingLandImpl extends FragmentMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.resultView, 1);
        sViewsWithIds.put(R.id.clearButton, 2);
        sViewsWithIds.put(R.id.parenthesisButton, 3);
        sViewsWithIds.put(R.id.percentageButton, 4);
        sViewsWithIds.put(R.id.divisionButton, 5);
        sViewsWithIds.put(R.id.button7, 6);
        sViewsWithIds.put(R.id.button8, 7);
        sViewsWithIds.put(R.id.button9, 8);
        sViewsWithIds.put(R.id.multiplyButton, 9);
        sViewsWithIds.put(R.id.button4, 10);
        sViewsWithIds.put(R.id.button5, 11);
        sViewsWithIds.put(R.id.button6, 12);
        sViewsWithIds.put(R.id.minusButton, 13);
        sViewsWithIds.put(R.id.button1, 14);
        sViewsWithIds.put(R.id.button2, 15);
        sViewsWithIds.put(R.id.button3, 16);
        sViewsWithIds.put(R.id.plusButton, 17);
        sViewsWithIds.put(R.id.plusMinusButton, 18);
        sViewsWithIds.put(R.id.button0, 19);
        sViewsWithIds.put(R.id.dotButton, 20);
        sViewsWithIds.put(R.id.equalButton, 21);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMainBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private FragmentMainBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[19]
            , (android.widget.Button) bindings[14]
            , (android.widget.Button) bindings[15]
            , (android.widget.Button) bindings[16]
            , (android.widget.Button) bindings[10]
            , (android.widget.Button) bindings[11]
            , (android.widget.Button) bindings[12]
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[7]
            , (android.widget.Button) bindings[8]
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[20]
            , (android.widget.Button) bindings[21]
            , (android.widget.Button) bindings[13]
            , (android.widget.Button) bindings[9]
            , null
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[17]
            , (android.widget.Button) bindings[18]
            , (android.widget.TextView) bindings[1]
            , null
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mainViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}