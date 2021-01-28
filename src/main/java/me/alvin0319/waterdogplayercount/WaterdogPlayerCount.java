package me.alvin0319.waterdogplayercount;

import io.github.waterfallmc.waterfall.QueryResult;
import io.github.waterfallmc.waterfall.event.ProxyQueryEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.event.EventHandler;
import net.md_5.bungee.event.EventPriority;

public class WaterdogPlayerCount extends Plugin implements Listener{

	@Override
	public void onEnable(){
		getProxy().getPluginManager().registerListener(this, this);
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void onProxyQuery(ProxyQueryEvent event){
		QueryResult result = event.getResult();

		result.setMaxPlayers(result.getOnlinePlayers() + 1);

		event.setResult(result);
	}
}
