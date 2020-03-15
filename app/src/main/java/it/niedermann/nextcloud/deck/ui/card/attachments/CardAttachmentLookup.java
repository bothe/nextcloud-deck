package it.niedermann.nextcloud.deck.ui.card.attachments;

import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.selection.ItemDetailsLookup;
import androidx.recyclerview.widget.RecyclerView;

import it.niedermann.nextcloud.deck.DeckLog;

public class CardAttachmentLookup extends ItemDetailsLookup<Long> {

    @NonNull
    private final RecyclerView recyclerView;

    CardAttachmentLookup(@NonNull RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    @Nullable
    @Override
    public ItemDetails<Long> getItemDetails(@NonNull MotionEvent e) {
        View view = recyclerView.findChildViewUnder(e.getX(), e.getY());
        if (view != null) {
            RecyclerView.ViewHolder viewHolder = recyclerView.getChildViewHolder(view);
            if (viewHolder instanceof AttachmentViewHolder) {
                return ((AttachmentViewHolder) viewHolder).getItemDetails();
            }
        }

        DeckLog.logError(new IllegalArgumentException("Could not found a viewholder under MotionEvent e"));
        return null;
    }
}