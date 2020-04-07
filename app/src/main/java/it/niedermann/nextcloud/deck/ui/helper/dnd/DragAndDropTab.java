package it.niedermann.nextcloud.deck.ui.helper.dnd;

import androidx.recyclerview.widget.RecyclerView;

public interface DragAndDropTab<ItemAdapter extends RecyclerView.Adapter<?> & DragAndDropAdapter<?>> {

    ItemAdapter getAdapter();

    RecyclerView getRecyclerView();
}


