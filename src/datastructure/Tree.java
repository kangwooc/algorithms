package datastructure;

import java.util.ArrayList;
//          트리의 구성 요소
//        자료가 저장된 노드(Node)들이 간선(Edge)로 서로 연결되어 있는 자료구조
//        연결된 두 노드 중 상위 노드를 부모(Parent) 노드, 하위 노드를 자식(Child)노드
//        부모 노드가 같은 노드는 형제 (sibling) 노드
//        트리에서 한 노드는 여러 개의 자식을 가질 수 있어도 부모는 하나만 가질 수 있음
//        이와 같은 속성으로 인해 트리에는 다른 모든 노드들을 자손으로 갖는 노드(Root)가 딱 하나가 됨.
//        반대로 자식이 없는 노드는 잎 노드(Leaf)
//
//        트리노드의 속성
//        어떤 노드에 도달하기 위해 거쳐야 하는 간선의 수를 해당 노드의 깊이(Depth)
//        이 때 트리에서 가장 깊숙히 있는 노드의 깊이를 해당 트리의 높이(Height)
//
//        트리의 재귀적 속성
//        트리에서 한 노드와 그의 자손들을 모드 모으면 그들도 하나의 트리(Sub tree)가 됨.
//        재귀적 속성으로 인해 트리를 다루는 코드들을 대개 재귀 호출을 이용해 구현
//
//        트리의 표현
//        각 노드를 하나의 구조체/객체로 표현하고, 이들을 객체로 연결
//        탐색용 트리 - 자식이 left와 right 밖에 없으므로 left, right를 이용해 자식을 저장
//        힙 - 노드가 들어갈 수 있는 자리가 비어있는 일이 없이 노드를 채워넣기 때문에, 배열을 사용해 표현
//        상호 베타적 집합 - 자신의 부모를 가리키는 포인터를 가지고 있을 뿐, 부모에 대한 정보는 없음

public class Tree<K> {
    Tree parent;
    K data;
    ArrayList<Tree<K>> children;

    public void printTree(Tree<K> root) {
        System.out.println(root.data);

        for (int i = 0; i < children.size(); i++) {
            printTree(root.children.get(i));
        }
    }
}
