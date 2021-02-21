package com.velocitypowered.proxy.network.packet.serverbound;

import com.velocitypowered.proxy.network.packet.AbstractStatusPingPacket;
import com.velocitypowered.proxy.network.packet.Packet;
import com.velocitypowered.proxy.network.packet.PacketHandler;
import com.velocitypowered.proxy.network.packet.PacketReader;

public class ServerboundStatusPingPacket extends AbstractStatusPingPacket implements Packet {
  public static final PacketReader<ServerboundStatusPingPacket> DECODER = decoder(ServerboundStatusPingPacket::new);

  public ServerboundStatusPingPacket(final long randomId) {
    super(randomId);
  }

  @Override
  public boolean handle(PacketHandler handler) {
    return handler.handle(this);
  }
}