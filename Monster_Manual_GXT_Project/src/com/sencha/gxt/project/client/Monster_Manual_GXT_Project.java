package com.sencha.gxt.project.client;

import java.util.ArrayList;
import java.util.List;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.cell.core.client.form.ComboBoxCell.TriggerAction;
import com.sencha.gxt.core.client.GXT;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.StringLabelProvider;
import com.sencha.gxt.project.client.MonsterData;
import com.sencha.gxt.project.client.Monsters;
import com.sencha.gxt.project.client.MonsterProperties;
import com.sencha.gxt.state.client.CookieProvider;
import com.sencha.gxt.state.client.GridStateHandler;
import com.sencha.gxt.state.client.StateManager;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.container.Viewport;
import com.sencha.gxt.widget.core.client.form.SimpleComboBox;
import com.sencha.gxt.widget.core.client.grid.CellSelectionModel;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;
import com.sencha.gxt.widget.core.client.grid.GridSelectionModel;
import com.sencha.gxt.widget.core.client.selection.CellSelectionChangedEvent;
import com.sencha.gxt.widget.core.client.selection.CellSelectionChangedEvent.CellSelectionChangedHandler;
import com.sencha.gxt.widget.core.client.toolbar.LabelToolItem;
import com.sencha.gxt.widget.core.client.toolbar.ToolBar;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Monster_Manual_GXT_Project implements IsWidget, EntryPoint {

	protected static final int MAX_HEIGHT = 600;
	protected static final int MAX_WIDTH = 800;
	protected static final int MIN_HEIGHT = 320;
	protected static final int MIN_WIDTH = 480;

	private static final MonsterProperties props = GWT.create(MonsterProperties.class);

	private ContentPanel panel;

	@Override
	public Widget asWidget() {
		if (panel == null) {
			ColumnConfig<Monsters, String> name1Col = new ColumnConfig<Monsters, String>(props.name1(), 50, "Name");
			ColumnConfig<Monsters, Integer> challengeRatingCol = new ColumnConfig<Monsters, Integer>(props.challengeRating(), 50, 
					"CR Rating");
			ColumnConfig<Monsters, Integer> challengeXPCol = new ColumnConfig<Monsters, Integer>(props.challengeXP(), 50,
					"Total XP");
			ColumnConfig<Monsters, String> armorTypeCol = new ColumnConfig<Monsters, String>(props.acType(), 50,
					"Armor Type");
			ColumnConfig<Monsters, Integer> armorClassCol = new ColumnConfig<Monsters, Integer>(props.armorClass(), 50,
					"Armor Class");
			ColumnConfig<Monsters, Integer> strScoreCol = new ColumnConfig<Monsters, Integer>(props.strScore(), 50,
					"Strength");
			ColumnConfig<Monsters, Integer> strModCol = new ColumnConfig<Monsters, Integer>(props.strMod(), 50,
					"Str Modifier");
			ColumnConfig<Monsters, Integer> dexScoreCol = new ColumnConfig<Monsters, Integer>(props.dexScore(), 50,
					"Dexterity");
			ColumnConfig<Monsters, Integer> dexModCol = new ColumnConfig<Monsters, Integer>(props.dexMod(), 50,
					"Dex Modifier");
			ColumnConfig<Monsters, Integer> conScoreCol = new ColumnConfig<Monsters, Integer>(props.conScore(), 50,
					"Constitution");
			ColumnConfig<Monsters, Integer> conModCol = new ColumnConfig<Monsters, Integer>(props.conMod(), 50,
					"Con Modifier");
			ColumnConfig<Monsters, Integer> intScoreCol = new ColumnConfig<Monsters, Integer>(props.intScore(), 50,
					"Intelligence");
			ColumnConfig<Monsters, Integer> intModCol = new ColumnConfig<Monsters, Integer>(props.intMod(), 50,
					"Int Modifier");
			ColumnConfig<Monsters, Integer> wisScoreCol = new ColumnConfig<Monsters, Integer>(props.wisScore(), 50,
					"Wisdom");
			ColumnConfig<Monsters, Integer> wisModCol = new ColumnConfig<Monsters, Integer>(props.wisMod(), 50,
					"Wis Modifier");
			ColumnConfig<Monsters, Integer> chaScoreCol = new ColumnConfig<Monsters, Integer>(props.chaScore(), 50,
					"Charisma");
			ColumnConfig<Monsters, Integer> chaModCol = new ColumnConfig<Monsters, Integer>(props.chaMod(), 50,
					"Cha Modifier");
			ColumnConfig<Monsters, String> hpDiceCol = new ColumnConfig<Monsters, String>(props.hpDice(), 50,
					"Hit Dice");
			ColumnConfig<Monsters, Integer> hpCol = new ColumnConfig<Monsters, Integer>(props.hp(), 50, "Hit Points");

			List<ColumnConfig<Monsters, ?>> columns = new ArrayList<ColumnConfig<Monsters, ?>>();
			columns.add(name1Col);
			columns.add(challengeRatingCol);
			columns.add(challengeXPCol);
			columns.add(armorTypeCol);
			columns.add(armorClassCol);
			columns.add(strScoreCol);
			columns.add(strModCol);
			columns.add(dexScoreCol);
			columns.add(dexModCol);
			columns.add(conScoreCol);
			columns.add(conModCol);
			columns.add(intScoreCol);
			columns.add(intModCol);
			columns.add(wisScoreCol);
			columns.add(wisModCol);
			columns.add(chaScoreCol);
			columns.add(chaModCol);
			columns.add(hpDiceCol);
			columns.add(hpCol);

			ColumnModel<Monsters> cm = new ColumnModel<Monsters>(columns);

			ListStore<Monsters> store = new ListStore<Monsters>(props.key());
			store.addAll(MonsterData.getMonsters());

			final Grid<Monsters> grid = new Grid<Monsters>(store, cm);
			grid.setAllowTextSelection(false);
			grid.getView().setAutoExpandColumn(name1Col);
			grid.getView().setStripeRows(true);
			grid.getView().setColumnLines(true);
			grid.setBorders(false);
			grid.setColumnReordering(true);

			// Stage manager, turn on state management
			grid.setStateful(true);
			grid.setStateId("monsterManualGXTProject");

			// Stage manager, load previous state
			GridStateHandler<Monsters> state = new GridStateHandler<Monsters>(grid);
			state.loadState();

			SimpleComboBox<String> typeCombo = new SimpleComboBox<String>(new StringLabelProvider<String>());
			typeCombo.setTriggerAction(TriggerAction.ALL);
			typeCombo.setEditable(false);
			typeCombo.setWidth(100);
			typeCombo.add("Row");
			typeCombo.add("Cell");
			typeCombo.setValue("Row");
			// we want to change selection model on select, not value change which fires on
			// blur
			typeCombo.addSelectionHandler(new SelectionHandler<String>() {
				@Override
				public void onSelection(SelectionEvent<String> event) {
					boolean cell = event.getSelectedItem().equals("Cell");
					if (cell) {
						CellSelectionModel<Monsters> c = new CellSelectionModel<Monsters>();
						c.addCellSelectionChangedHandler(new CellSelectionChangedHandler<Monsters>() {
							@Override
							public void onCellSelectionChanged(CellSelectionChangedEvent<Monsters> event) {
							}
						});
						grid.setSelectionModel(c);
					} else {
						grid.setSelectionModel(new GridSelectionModel<Monsters>());
					}
				}
			});
			typeCombo.addValueChangeHandler(new ValueChangeHandler<String>() {
				@Override
				public void onValueChange(ValueChangeEvent<String> event) {
				}
			});

			ToolBar toolBar = new ToolBar();
			toolBar.setEnableOverflow(false);
			toolBar.add(new LabelToolItem("Selection Mode: "));
			toolBar.add(typeCombo);

			VerticalLayoutContainer con = new VerticalLayoutContainer();
			con.add(toolBar, new VerticalLayoutData(1, -1));
			con.add(grid, new VerticalLayoutData(1, 1));

			panel = new ContentPanel();
			panel.setHeading("List of Monsters in the D&D 5th edition Monster Manual");

			panel.add(con);
			

		}
		return panel;
	}

	@Override
  public void onModuleLoad() {
    // State manager, initialize the state options
    StateManager.get().setProvider(new CookieProvider("/", null, null, GXT.isSecure()));

    Viewport vp = new Viewport();
    vp.add(this);	
    
    RootPanel.get().add(vp);
    
  	}
}