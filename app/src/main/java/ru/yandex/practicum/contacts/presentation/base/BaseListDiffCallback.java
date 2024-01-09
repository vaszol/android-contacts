package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;


public class BaseListDiffCallback<U extends ListDiffInterface<U>> extends DiffUtil.ItemCallback<U> {

    @Override
    public boolean areItemsTheSame(@NonNull U oldItem, @NonNull U newItem) {
        return oldItem.theSameAs(newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull U oldItem, @NonNull U newItem) {
        return oldItem.equals(newItem);
    }

    @Nullable
    @Override
    public Object getChangePayload(@NonNull U oldItem, @NonNull U newItem) {
        return newItem;
    }
}
