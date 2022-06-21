package easy

class _1108DefangingAnIpAddress {
    class Solution {
        fun defangIPaddr(address: String): String {
            return address.replace(".", "[.]")
        }
    }
}