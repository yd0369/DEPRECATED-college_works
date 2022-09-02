#include<iostream>

using namespace std;
class Point {
    private:
        double m_x, m_y, m_z;
    public:
        Point(double x = 0.0, double y = 0.0, double z = 0.0): m_x(x), m_y(y), m_z(z) {}
    Point operator - () const;
    bool operator!() const;
    double getX() {
        return m_x;
    }
    double getY() {
        return m_y;
    }
    double get2() {
        return m_z;
    }

};
Point Point::operator - () const {
    return Point(-m_x, -m_y, -m_z);
}
bool Point::operator!() const {
    return (m_x == 0.0 && m_y == 0.0 && m_z == 0.0);
}

main() {
    Point point;

    if (!point) {
        cout << "point is set at the origin. \n";
    } else {
        cout << "point is not set at the origin.\n";
    }
}