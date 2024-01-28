class Solution {
public:
    vector<double> convertTemperature(double celsius) {
        double f,k;
        f=celsius*1.80+32.00;
        k=celsius+273.15;
        vector<double> v;
        v.push_back(k);
        v.push_back(f);
        return v;
    }
};