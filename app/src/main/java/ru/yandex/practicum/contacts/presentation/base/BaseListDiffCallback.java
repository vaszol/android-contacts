package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;


public class BaseListDiffCallback<U extends ListDiffInterface<U>> extends DiffUtil.ItemCallback<U> {

    @Override
    public boolean areItemsTheSame(@NonNull U oldItem, @NonNull U newItem) {
        return oldItem.theSameAs(newItem) == newItem.theSameAs(oldItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull U oldItem, @NonNull U newItem) {
        return false;
    }
}
