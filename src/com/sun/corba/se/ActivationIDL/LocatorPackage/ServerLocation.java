package com.sun.corba.se.ActivationIDL.LocatorPackage;


/**
* com/sun/corba/se/ActivationIDL/LocatorPackage/ServerLocation.java .
* Generated by the IDL-to-Java compiler (portable), version "3.1"
* from ../../../../../../src/share/classes/com/sun/corba/se/ActivationIDL/activation.idl
* Thursday, August 29, 2002 2:54:21 AM PDT
*/


// endpoint
public final class ServerLocation implements org.omg.CORBA.portable.IDLEntity
{
  public String hostname = null;
  public com.sun.corba.se.ActivationIDL.ORBPortInfo ports[] = null;

  public ServerLocation ()
  {
  } // ctor

  public ServerLocation (String _hostname, com.sun.corba.se.ActivationIDL.ORBPortInfo[] _ports)
  {
    hostname = _hostname;
    ports = _ports;
  } // ctor

} // class ServerLocation
