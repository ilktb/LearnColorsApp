package crc64d2e564f02343fedc;


public class LevelTwoFragment
	extends android.support.v4.app.Fragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;:GetOnCreateView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("PROOSLearnColors.Fragments.LevelTwoFragment, PROOSLearnColors", LevelTwoFragment.class, __md_methods);
	}


	public LevelTwoFragment ()
	{
		super ();
		if (getClass () == LevelTwoFragment.class)
			mono.android.TypeManager.Activate ("PROOSLearnColors.Fragments.LevelTwoFragment, PROOSLearnColors", "", this, new java.lang.Object[] {  });
	}

	public LevelTwoFragment (int p0)
	{
		super ();
		if (getClass () == LevelTwoFragment.class)
			mono.android.TypeManager.Activate ("PROOSLearnColors.Fragments.LevelTwoFragment, PROOSLearnColors", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public android.view.View onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2)
	{
		return n_onCreateView (p0, p1, p2);
	}

	private native android.view.View n_onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
