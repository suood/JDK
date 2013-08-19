package com.sun.corba.se.ActivationIDL.LocatorPackage;


/**
* com/sun/corba/se/ActivationIDL/LocatorPackage/ServerLocationPerORBHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.1"
* from ../../../../../../src/share/classes/com/sun/corba/se/ActivationIDL/activation.idl
* Thursday, August 29, 2002 2:54:21 AM PDT
*/


// ORB
abstract public class ServerLocationPerORBHelper
{
  private static String  _id = "IDL:ActivationIDL/Locator/ServerLocationPerORB:1.0";

  public static void insert (org.omg.CORBA.Any a, com.sun.corba.se.ActivationIDL.LocatorPackage.ServerLocationPerORB that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static com.sun.corba.se.ActivationIDL.LocatorPackage.ServerLocationPerORB extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "hostname",
            _tcOf_members0,
            null);
          _tcOf_members0 = com.sun.corba.se.ActivationIDL.EndPointInfoHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (com.sun.corba.se.ActivationIDL.EndpointInfoListHelper.id (), "EndpointInfoList", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "ports",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (com.sun.corba.se.ActivationIDL.LocatorPackage.ServerLocationPerORBHelper.id (), "ServerLocationPerORB", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static com.sun.corba.se.ActivationIDL.LocatorPackage.ServerLocationPerORB read (org.omg.CORBA.portable.InputStream istream)
  {
    com.sun.corba.se.ActivationIDL.LocatorPackage.ServerLocationPerORB value = new com.sun.corba.se.ActivationIDL.LocatorPackage.ServerLocationPerORB ();
    value.hostname = istream.read_string ();
    value.ports = com.sun.corba.se.ActivationIDL.EndpointInfoListHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, com.sun.corba.se.ActivationIDL.LocatorPackage.ServerLocationPerORB value)
  {
    ostream.write_string (value.hostname);
    com.sun.corba.se.ActivationIDL.EndpointInfoListHelper.write (ostream, value.ports);
  }

}
