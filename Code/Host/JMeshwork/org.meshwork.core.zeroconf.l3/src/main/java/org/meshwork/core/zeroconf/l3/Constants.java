package org.meshwork.core.zeroconf.l3;

/**
 * Created by Sinisha Djukic on 14-2-11.
 */
public interface Constants {

    public static final byte MAX_SERIALMSG_LEN 			= 64;//TODO calculate the right size!
    public static final byte MAX_SERIAL_LEN 			= 16;

    public static final byte MSGCODE_OK 				= 0;
    public static final byte MSGCODE_NOK 				= 1;
    public static final byte MSGCODE_UNKNOWN 			= 2;

    public static final byte MSGCODE_ZCINIT 			= 48;
    public static final byte MSGCODE_ZCDEINIT 			= 49;
    public static final byte MSGCODE_ZCID 				= 50;
    public static final byte MSGCODE_ZCIDRES 			= 51;
    public static final byte MSGCODE_ZCNWKID 			= 52;
    public static final byte MSGCODE_ZCNWKIDRES 		= 53;
    public static final byte MSGCODE_ZCCFGNWK 			= 54;
    public static final byte MSGCODE_ZCCFGREP 			= 55;
    public static final byte MSGCODE_ZCCFGSERIAL		= 56;

    //0-63
    public static final byte ERROR_GENERAL 				= 0;
    public static final byte ERROR_INSUFFICIENT_DATA 	= 1;
    public static final byte ERROR_TOO_LONG_DATA 		= 2;
    public static final byte ERROR_ILLEGAL_STATE 		= 3;
    public static final byte ERROR_KEY_TOO_LONG 		= 7;
    public static final byte ERROR_SEQUENCE_MISMATCH	= 8;
    public static final byte ERROR_SERIAL_TOO_LONG 		= 9;

    public static final short TIMEOUT_RESPONSE 			= 5000;

    //flags for configuring reporting
    public static final byte MASK_REPORT_NWK_ADD_REMOVE		= 1 << 0;
    public static final byte MASK_REPORT_DISCRETE_CHANGE	= 1 << 1;
    public static final byte MASK_REPORT_THRESHOLD_CHANGE	= 1 << 2;


    //TODO same as in host.l3.Constants - pull to a common place
    /** First possible node ID. */
    public static final byte MIN_NODE_ID 	= 1;
    /** Last possible node ID. */
    public static final byte MAX_NODE_ID 	= (byte) 254;
    /** Maximum node count in the network. */
    public static final byte MAX_NODE_COUNT = MAX_NODE_ID - MIN_NODE_ID;

    /** Maximum length of a network key. */
    public static final byte MAX_NETWORK_KEY_LEN 	= 8;

}
