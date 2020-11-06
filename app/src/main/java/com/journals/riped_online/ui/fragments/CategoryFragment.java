package com.journals.riped_online.ui.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.snackbar.Snackbar;
import com.journals.riped_online.databinding.FragmentCategoryBinding;
import com.journals.riped_online.helper.utils;
import com.journals.riped_online.model.CategoryResponse;
import com.journals.riped_online.ui.adapter.CategoryListAdapter;
import com.journals.riped_online.ui.viewmodel.CategoryViewModel;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CategoryFragment#} factory method to
 * create an instance of this fragment.
 */
public class CategoryFragment extends Fragment {
    private static final String TAG = "CategoryFragment";

    FragmentCategoryBinding fragmentCategoryBinding;
    ArrayList<CategoryResponse.JournalDetailsBean> subcatDetailsBeanArrayList = new ArrayList<>();
    CategoryViewModel categoryViewModel;

    CategoryListAdapter categoryListAdapter;


    public CategoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentCategoryBinding = FragmentCategoryBinding.inflate(getLayoutInflater(), container, false);


        categoryViewModel = new ViewModelProvider(this).get(CategoryViewModel.class);
        categoryViewModel.init("1",requireActivity());

        // progress bar
        categoryViewModel.getProgressbarObservable().observe(getViewLifecycleOwner(), aBoolean -> {
            if (aBoolean){
                fragmentCategoryBinding.progressBar.setVisibility(View.VISIBLE);

            }else {
                fragmentCategoryBinding.progressBar.setVisibility(View.GONE);
            }
        });

        // Alert toast msg
        categoryViewModel.getToastObserver().observe(getViewLifecycleOwner(), message -> {
            Snackbar snackbar = Snackbar.make(fragmentCategoryBinding.getRoot().getRootView(), message, Snackbar.LENGTH_LONG);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.BLACK);
            snackbar.show();

            utils.noNetworkAlert(getActivity(),message);
        });

        // get home data
        categoryViewModel.getCategoryRepository().observe(getViewLifecycleOwner(), homeResponse -> {


            if (homeResponse != null){
                List<CategoryResponse.JournalDetailsBean> catDetailsBeanList = homeResponse.getJournal_details();

                subcatDetailsBeanArrayList.addAll(catDetailsBeanList);

                categoryListAdapter = new CategoryListAdapter(catDetailsBeanList, getActivity());
                fragmentCategoryBinding.recyclerCategoryList.setAdapter(categoryListAdapter);

                fragmentCategoryBinding.progressBar.setVisibility(View.GONE);

                categoryListAdapter.notifyDataSetChanged();
                fragmentCategoryBinding.txtEmptyView.setVisibility(View.GONE);
                Log.d(TAG, "onCreateView: "+" data found");
            }else {
                Log.d(TAG, "onCreateView: "+"NO data");
                fragmentCategoryBinding.recyclerCategoryList.setVisibility(View.GONE);
                fragmentCategoryBinding.txtEmptyView.setVisibility(View.VISIBLE);
            }

        });



        return fragmentCategoryBinding.getRoot();
    }

}