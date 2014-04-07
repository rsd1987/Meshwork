package org.meshwork.core.host.l3;

import org.meshwork.core.AbstractMessage;
import org.meshwork.core.MessageData;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Sinisha Djukic on 14-2-10.
 */
public class MRFGetRouteCount extends AbstractMessage implements Constants {

    public byte dst;

    public MRFGetRouteCount(byte seq) {
        super(MSGCODE_RFGETROUTECOUNT, seq);
    }

    @Override
    public void toString(PrintWriter writer, String rowPrefix, String rowSuffix, String separator) {
        writer.print("MRFGetRouteCount: Dst=");writer.print(dst);
    }

    @Override
    public AbstractMessage deserialize(MessageData msg) throws IOException {
        MRFGetRouteCount result = new MRFGetRouteCount(msg.seq);
        result.dst = msg.data[0];
        return result;
    }

    @Override
    public void serialize(MessageData msg) {
        msg.seq = seq;
        msg.code = getCode();
        msg.data = new byte[1];
        msg.data[0] = dst;
        msg.len = (byte) (msg.data.length + 1);
    }
}