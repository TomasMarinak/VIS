package com.project.gateway;

import com.project.models.Seat;

import java.sql.Connection;
import java.sql.ResultSet;

public class SeatGateway extends  Gateway<Seat> {
    public SeatGateway(Connection connection ) {
        super(connection);
    }

    @Override
    public void save(Seat seat) {
        super.save(seat);
    }

    @Override
    public ResultSet find(Long id) {
        return super.find(id);
    }

    @Override
    public void delete(Long id) {
        super.delete(id);
    }

    @Override
    public void update(Seat seat) {
        super.update(seat);
    }
}
