package com.sun.corba.se.ActivationIDL.LocatorPackage;

/**
* com/sun/corba/se/ActivationIDL/LocatorPackage/ServerLocationPerORBHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.1"
* from ../../../../../../src/share/classes/com/sun/corba/se/ActivationIDL/activation.idl
* Thursday, August 29, 2002 2:54:21 AM PDT
*/


// ORB
public final class ServerLocationPerORBHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.ActivationIDL.LocatorPackage.ServerLocationPerORB value = null;

  public ServerLocationPerORBHolder ()
  {
  }

  public ServerLocationPerORBHolder (com.sun.corba.se.ActivationIDL.LocatorPackage.ServerLocationPerORB initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.ActivationIDL.LocatorPackage.ServerLocationPerORBHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.ActivationIDL.LocatorPackage.ServerLocationPerORBHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.ActivationIDL.LocatorPackage.ServerLocationPerORBHelper.type ();
  }

}
