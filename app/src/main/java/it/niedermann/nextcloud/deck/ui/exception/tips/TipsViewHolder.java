package it.niedermann.nextcloud.deck.ui.exception.tips;

import android.content.Intent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.RecyclerView;

import it.niedermann.nextcloud.deck.databinding.ItemTipBinding;

public class TipsViewHolder extends RecyclerView.ViewHolder {
    private final ItemTipBinding binding;

    @SuppressWarnings("WeakerAccess")
    public TipsViewHolder(@NonNull View itemView) {
        super(itemView);
        binding = ItemTipBinding.bind(itemView);
    }

    public void bind(TipsModel tip, Consumer<Intent> actionButtonClickedListener) {
        binding.tip.setText(tip.getText());
        // TODO Requires https://github.com/nextcloud/Android-SingleSignOn/pull/203 to be merged, released and used, otherwise will crash
//        final Intent actionIntent = tip.getActionIntent();
//        if (actionIntent != null && actionIntent.hasExtra(INTENT_EXTRA_BUTTON_TEXT)) {
//            binding.actionButton.setVisibility(View.VISIBLE);
//            binding.actionButton.setText(actionIntent.getIntExtra(INTENT_EXTRA_BUTTON_TEXT, 0));
//            binding.actionButton.setOnClickListener((v) -> actionButtonClickedListener.accept(actionIntent));
//        } else {
        binding.actionButton.setVisibility(View.GONE);
//        }
    }
}