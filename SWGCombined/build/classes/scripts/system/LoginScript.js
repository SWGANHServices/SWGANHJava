function executeCommand(ScriptManager, player, target, args) {
	var buildChatSystemMessage = Java.type("PacketFactory.buildChatSystemMessage");
	var RequestType = Java.type("PacketFactory.buildChatSystemMessage");
	var name;
	
	if(args == null) {
		return;
	}
	
	name = args.split(" ")[0].toLowerCase(java.util.Locale.English);
	
	if(name == null) {
		return;
	}
	
	new "PacketFactory.buildChatSystemMessage"(player, name, RequestType.FRIEND_ADD_TARGET).broadcast();
}