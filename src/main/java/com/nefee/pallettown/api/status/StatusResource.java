package com.nefee.pallettown.api.status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/status")
public class StatusResource {

    private final String IS_ALIVE = "Pallet Town is alive :)";

    @GET
    @Path("/isAlive")
    @Produces((MediaType.TEXT_PLAIN))
    public String getStatus() {
        return IS_ALIVE;
    }
}
