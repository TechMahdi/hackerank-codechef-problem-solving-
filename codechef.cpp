#include<bits/stdc++.h>
using namespace std;
int main ()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int t,n;
    cin>>t;

    while(t>0)
    {
        cin>>n;
         int om[n],add[n],om_strike=0,add_streak=0,s1=0,s2=0;

        for(int i=0;i<n;i++)
        {
            cin>>om[i];
            if(om[i]>0)
            {
                om_strike++;
            }
            else
            {
                s1= max(s1, om_strike);
            }

        }
        for(int i=0;i<n;i++)
        {
            cin>>add[i];
            if(add[i]>0)
            {
                add_streak++;
            }
            else
            {
                s2=max(s2,add_streak);
            }
        }


        if(s1>s2)
        {
            cout<<"Om"<<endl;
        }
        else if(s2>s1)
        {
            cout<<"Addy"<<endl;
        }
        else
        {
            cout<<"Draw"<<endl;
        }
            t--;

    }


    return 0;
}
