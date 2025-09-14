class Solution {
public:
    ListNode* rotateRight(ListNode* head, int k) {
        if (!head || !head->next || k == 0) return head;

        // Step 1: Count length
        ListNode* temp = head;
        int cnt = 1;
        while (temp->next) {
            cnt++;
            temp = temp->next;
        }

        // Step 2: Make circular
        temp->next = head;

        // Step 3: Normalize k
        k = k % cnt;
        if (k == 0) {
            temp->next = nullptr; // break circle
            return head;
        }

        // Step 4: Find new head
        int stepsToNewHead = cnt - k;
        temp = head;
        for (int i = 1; i < stepsToNewHead; i++) {
            temp = temp->next;
        }

        // Step 5: Break circle
        head = temp->next;
        temp->next = nullptr;

        return head;
    }
};