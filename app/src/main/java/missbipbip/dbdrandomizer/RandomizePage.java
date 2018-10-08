package missbipbip.dbdrandomizer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import main.RandomizedAsset;

/**
 * Created by MissBipBip on 28/03/2018.
 */

public class RandomizePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.randomize_page);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void doRandomize(View view) {

        if( (int) (Math.random() * 2) == 0 ){
            doRandomizeSurvivor(view);
        } else {
            doRandomizeKiller(view);

        }

    }
    public void doRandomizeSurvivor(View view){

        RandomizedAsset r = new RandomizedAsset();

        TextView survivorLabel = findViewById(R.id.survivorLabel);
        survivorLabel.setText("Survivor :");
        TextView survivor = findViewById(R.id.survivorName);
        survivor.setText(r.getSurvivor().toString());

        TextView perksLabel = findViewById(R.id.perksLabel);
        perksLabel.setText("Perks :");
        TextView perk1 = findViewById(R.id.perk1);
        perk1.setText(r.getSPerk1().toString());
        TextView perk2 = findViewById(R.id.perk2);
        perk2.setText(r.getSPerk2().toString());
        TextView perk3 = findViewById(R.id.perk3);
        perk3.setText(r.getSPerk3().toString());
        TextView perk4 = findViewById(R.id.perk4);
        perk4.setText(r.getSPerk4().toString());

        TextView itemLabel = findViewById(R.id.itemLabel);
        itemLabel.setText("Item :");
        TextView item = findViewById(R.id.item);
        item.setText(r.getItem().toString());

        TextView addonLabel = findViewById(R.id.addonLabel);
        addonLabel.setText("Addons :");
        TextView addon1 = findViewById(R.id.addon1);
        addon1.setText(r.getAddOn1().toString());
        TextView addon2 = findViewById(R.id.addon2);
        addon2.setText(r.getAddOn2().toString());

        TextView offeringLabel = findViewById(R.id.offeringLabel);
        offeringLabel.setText("Offering :");
        TextView offering = findViewById(R.id.offering);
        offering.setText(r.getsOffering().toString());
    }

    public void doRandomizeKiller(View view){
        RandomizedAsset r = new RandomizedAsset();

        TextView survivorLabel = findViewById(R.id.survivorLabel);
        survivorLabel.setText("Killer :");
        TextView survivor = findViewById(R.id.survivorName);
        survivor.setText(r.getKiller().toString());

        TextView perksLabel = findViewById(R.id.perksLabel);
        perksLabel.setText("Perks :");
        TextView perk1 = findViewById(R.id.perk1);
        perk1.setText(r.getkperk1().toString());
        TextView perk2 = findViewById(R.id.perk2);
        perk2.setText(r.getkperk2().toString());
        TextView perk3 = findViewById(R.id.perk3);
        perk3.setText(r.getkperk3().toString());
        TextView perk4 = findViewById(R.id.perk4);
        perk4.setText(r.getkperk4().toString());

        TextView itemLabel = findViewById(R.id.itemLabel);
        itemLabel.setText("");
        TextView item = findViewById(R.id.item);
        item.setText("");

        TextView addonLabel = findViewById(R.id.addonLabel);
        addonLabel.setText("Addons :");
        TextView addon1 = findViewById(R.id.addon1);
        addon1.setText(r.getPowerAddOn1().toString());
        TextView addon2 = findViewById(R.id.addon2);
        addon2.setText(r.getPowerAddOn2().toString());

        TextView offeringLabel = findViewById(R.id.offeringLabel);
        offeringLabel.setText("Offering :");
        TextView offering = findViewById(R.id.offering);
        offering.setText(r.getkOffering().toString());

    }
}
