# **<Day3 :  Git명령어에  대한  보고서>**

  
## 1. Git의 기본

<br>

>###  Git의 정의

- 파일의 변경사항을 추적하고 다수의 사용자들 간에 해당 파일들의 작업을 조율하기 위한 분산 버전 관리 시스템
- 소스 코드가 변경된 이력을 쉽게 확인할 수 있다. 
- 특정 시점에 저장된 버전과 비교하거나 특정 시점으로 되돌아갈 수도 있다.

<br>

>### 속성 용어 설명

-  `repository` / `repo` (저장소) : Git으로 버전 관리하는 디렉토리를 의미

-  `local repository` (로컬 저장소) : 내 PC에 파일이 저장되는 개인 전용 저장소

-  `remote repository` (원격 저장소) : 파일이 GitHub 등 외부 서버에서 관리되며 여러 사람이 함께 공유하기 위한 저장소

-  `commit` (커밋) : 파일 및 폴더의 추가/변경 사항을 저장소에 기록, 즉 버전을 의미

-  `branch` (브랜치) : 한국어로 번역하면 가지치기 또는 갈래라고 하는데 또 다른 작업공간을 의미

-  `merge` (머지) : 병합 또는 합치기라고 하는데 특정 브랜치에서 작업한 내용을 또 다른 브랜치에 적용하는 것을 의미

---

<br>

## 2. Git의 기본 명령어

<br>

>### 저장소 만들기

-  `git config` : git사용자 정보를 설정한다(최초 1회만 실행)

```
$ git config --global user.name "Kiyong Kwak"
$ git config --global user.email kky941230@naver.com
```

-  `git init` : 비어있는 git 저장소를 만들거나 이미 있는 저장소를 다시 초기화하는 명령어.

	- 실제로는 `.git`이라는 숨김 폴더가 해당 폴더에 생성되고 git관련 파일들이 생성됩니다.

```
$ mkdir sample 			// 'sample' 디렉터리 생성
$ cd sample 			// 'sample' 디렉터리로 이동
$ touch black white 	// 'black' , 'white' 라는 빈 파일 2개 생성
$ echo "검정" >> black 	// 'black' 파일에 '검정' 이라는 내용 추가
$ echo "하얀" >> white	// 'white' 파일에 '하얀' 이라는 내용 추가

$ git init
```
```
결과 >> Initialized empty Git repository in C:/Users/곽기용/sample/.git/
```

<br>

>### 현재 상태 확인

-  `git status` : 저장소의 상태, 현재 작업 중인 파일의 상태를 확인

```
$ git status
```
```
On branch master // 현재 브랜치의 이름 (master)
No commits yet // 커밋 상태

Untracked files:
(use "git add <file>..." to include in what will be committed)
black
white
nothing added to commit but untracked files present (use "git add" to track)
```

<br>

>### 현재 상태 추적

-  `git add [-A] [파일명/폴더명]` : 특정 파일의 변경 사항을 인덱스에 추가
- git은 커밋 하기 전, 인덱스에 먼저 커밋 할 파일을 추가합니다.

```
$ git add -A // 현재 디렉터리에 있는 모든 파일을 index에 추가.

$ git status
```  
```
On branch master

No commits yet

Changes to be committed:

(use "git rm --cached <file>..." to unstage)

new file: black

new file: white
```

<br>  

>### 현재 상태 저장

-  `git commit [-m <msg>]` : 인덱스에 올라간(stage) 파일을 `commit` 한다.

-  `Commit`이 세이브 개념, `-m`은 저장과 동시에 메세지를 남긴다는 옵션

```
$ git commit -m "first test commit"
```
```
[master (root-commit) d3837f1] first test commit

2 files changed, 2 insertions(+)

create mode 100644 black

create mode 100644 white
```

- 새 파일 추가

```
$ touch blue 			// 'blue' 라는 빈 파일 생성
$ echo "파랑" >> blue 	

$ git status
```
```
On branch master

Untracked files:

(use "git add <file>..." to include in what will be committed)

blue

nothing added to commit but untracked files present (use "git add" to track) 
```
```
$ git add -A

$ git commit -m "second test commit"
```
```
[master ed6c6cb] second test commit

1 file changed, 1 insertion(+)

create mode 100644 blue
```

- 추가/수정/삭제를 이용한 세 번째 `commit`

```
$ rm black 					// 'black' 파일 삭제
$ echo "하얀색" >> white 
$ touch purple 

$ git status
```
```
On branch master

Changes not staged for commit:

(use "git add/rm <file>..." to update what will be committed)

(use "git restore <file>..." to discard changes in working directory)

deleted: black

modified: white


Untracked files:

(use "git add <file>..." to include in what will be committed)

purple


no changes added to commit (use "git add" and/or "git commit -a")
```
```
$ git add -A

$ git commit -m "third test commit"
```
```
[master 10afc4f] third test commit

3 files changed, 1 insertion(+), 1 deletion(-)

delete mode 100644 black

create mode 100644 purple
```

<br>

>### 이력 확인

-  `git log` : `commit`기록을 볼 수 있는 명령어

- 전체 `commit` 기록 확인

```
$ git log
```
```
commit 10afc4fc460b9baaf13f5704d13eca0cee8ba95e (HEAD -> master)

Author: Kiyong Kwak <kky941230@naver.com>

Date: Tue Nov 29 21:46:09 2022 +0900
  

third test commit
 

commit ed6c6cbc69dc8eee0ca720d680cb920787441d8d

Author: Kiyong Kwak <kky941230@naver.com>

Date: Tue Nov 29 21:40:59 2022 +0900

  

second test commit
  

commit d3837f17a8c94c491b179d19ee527b98b02aa8a7

Author: Kiyong Kwak <kky941230@naver.com>

Date: Tue Nov 29 21:32:55 2022 +0900

  

first test commit

```


<br>

>### 과거 commit 으로 돌아가기

<br>

-  `git reset [<commit>] [--soft | --mixed [-N] | --hard | --merge | --keep]` 
: 특정 커밋까지 이력을 초기화합니다. 바로 전, 또는 n번 전까지 작업했던 내용을 취소할 수 있습니다.

	-  `hard` : 돌아가려는 이력 이후의 모든 내용을 지워 버립니다

	-  `soft` : 돌아가려 했던 이력으로 되돌아갔지만, 이후의 내용이 지워지지 않고, 해당 내용의 인덱스(stage)도 유지. 
(바로 다시 커밋 할 수 있는 상태로 남아있는 것)

	-  `mixed` : 이력은 되돌려집니다. 이후에 변경된 내용에 대해서는 남아있지만, 인덱스는 초기화 됩니다. 
(커밋을 하려면 다시 변경된 내용은 추가해야 하는 상태)

- 2번째 커밋까지 이력 초기화하기, 즉 3번째 커밋 이력 삭제

```
$ git reset --hard ed6c6cbc69dc8eee0ca720d680cb920787441d8d // git reset --hard { 2번 커밋 ID }
```
```
HEAD is now at ed6c6cb second test commit
```
  
```
$ git log 		
```
```
// 3번째 커밋이력이 사라짐

commit ed6c6cbc69dc8eee0ca720d680cb920787441d8d (HEAD -> master)

Author: Kiyong Kwak <kky941230@naver.com>

Date: Tue Nov 29 21:40:59 2022 +0900

  

second test commit

  

commit d3837f17a8c94c491b179d19ee527b98b02aa8a7

Author: Kiyong Kwak <kky941230@naver.com>

Date: Tue Nov 29 21:32:55 2022 +0900

  

first test commit

```

  

-  `git revert <commit>…​` : 특정 커밋을 취소하는 새로운 커밋을 만듭니다.

  

	- 일반적으로 특정 버전을 배포했는데 문제가 생기면 문제가 생긴 커밋을 revert합니다. (빠른 조치/롤백)

  

- 이전 실습을 통해 지워졌던 3번째 커밋을 다시 추가하고, 다시 3번 커밋을 취소해보기

```
// reset으로 지웠던 세번째 commit을 다시 추가한 상태


$ git revert 1e54027273d8d // git revert { 3번째 커밋 ID }
```
```
[master a3454f4] Revert "third test commit"

3 files changed, 1 insertion(+), 1 deletion(-)

create mode 100644 black

delete mode 100644 purple
```

---

<br>

## 3. Git의 작업 분기 관련 명령어

<br>

>### 브랜치 생성

-  `git switch (-c|-C) <new-branch>` : 현재 브랜치에서 새로운 브랜치를 생성.

-  `-c` 옵션은 브랜치 생성과 이동을 한번에 수행합니다. 아래 명령어와 결과가 같다.

```
git branch <new-branch>
git swtich <new-branch>
```

  

- 실습 : `-c` 옵션으로 `add-color` 브랜치를 생성하면서 이동

```
$ git switch -c add-color
```
```
Switched to a new branch 'add-color'
```

<br>

>### 새로운 브랜치에서 작업

- 실습 : `green` , `red` 파일 추가 --:arrow_forward: 변경사항을 모두 인덱스에 추가 --:arrow_forward: 커밋

```
$ touch green red
$ echo "녹색" >> green
$ echo "빨강" >> red

$ git add -A
```
```
[add-color a7128cb] add green,red

2 files changed, 2 insertions(+)

create mode 100644 green

create mode 100644 red
```

<br>  

>### 브랜치 변경

-  `master` 브랜치로 이동

-  `add-color` 브랜치에서 진행한 작업이 기존 `master` 브랜치와 독립적인 것을 확인

```
$ git switch master
```
```
Switched to branch 'main'
```
```
$ ls
```
```
black blue white 	// add-color 브랜치에서 추가한 green, red 파일이 사라지고 이전 상태로 돌아온 것을 확인
```

- 실습 : `update-red` 브랜치를 생성 후 이동 및 작업수행

```
$ git switch -c update-red // update-red 브랜치를 생성 후 이동
```
```
Switched to a new branch 'update-red'
```
```
$ echo "붉은색" >> red // red 파일에 "붉은색" 입력
$ git add -A // 전체 변경사항을 인덱스에 추가

$ git commit -m "update red" // 커밋
```
```
[update-red ae270bb] update red

1 file changed, 1 insertion(+)
```

<br>

>### 브랜치 합치기

-  `git merge [브랜치명]` : 현재 브랜치에 특정 브랜치를 `merge`(병합) 한다.

- 실습 : `master` 브랜치와 `add-color` 브랜치를 `merge` 하기.

	- `master` 브랜치에 `green` , `red` 파일이 추가된 것을 확인
	
	- `add-color`에서 작성한 커밋 로그가 `master` 브랜치에도 추가된 것을 확인
```
$ git switch master 	// master 브랜치로 이동
```
```
Switched to branch 'master'

Your branch is up to date with 'origin/master'.
```
```
$ git merge add-color 	// add-color 브랜치와 합친다.
```
```
Updating a3454f4..a7128cb

Fast-forward

green | 1 +

red | 1 +

2 files changed, 2 insertions(+)

create mode 100644 green

create mode 100644 red
```

 <br> 

>### 충돌 해결

- 실습 : `update-red` 브랜치에서 수정한 `red` 파일을 `master` 브랜치에서도 수정하여 충돌 상황 만들기.

```
$ echo "새빨간색" > red

$ git add -A

$ git commit -m "update red color"
```
```
[master 2a57561] update red color

1 file changed, 1 insertion(+), 1 deletion(-)
```
```
$ git merge update-red
```
```
Auto-merging red

CONFLICT (add/add): Merge conflict in red

Automatic merge failed; fix conflicts and then commit the result.
```

  

-  `CONFLICT` 라는 메시지와 함께 실패, 충돌이 발생하면 양쪽 브랜치에서 동시에 변경된 사항을 표시해 줍니다. 

	- 아래는 `red` 파일의 내용입니다.

```
<<<<<< HEAD

뻘건색

=======

붉은색

>>>>>> update-red
```

- 여기서 붉은색 만 남기고 모두 삭제한 후 다시 커밋하면 성공적으로 수행 완료

```
$ git add -A

$ git commit // 충돌을 수정한 내용을 자동으로 메시지로 만들기 때문에 -m 메시지를 입력하지 않아도 됨
```
```
[master 9ab301d] Merge branch 'update-red'
```

---

<br>

## 4. Github 공유

<br>

>### 원격 저장소 저장

-  `git remote add [원격저장소 이름] [Github 원격저장소 URL]` : 로컬저장소와 Github원격저장소를 연결한다.

-  `git push <저장소명> <브랜치명>` : 설정한 원격 저장소에 로컬 저장소의 모든 커밋을 푸시합니다.

```
$ git remote add origin https://github.com/kiyong94/sample.git

$ git branch -M main

  
$ git push -u origin main		// -u : 최초에 저장소명과 브랜치명을 입력하면 그 이후에는 모든 인자를 생략가능
```
```
Enumerating objects: 25, done.

Counting objects: 100% (25/25), done.

Delta compression using up to 4 threads

Compressing objects: 100% (15/15), done.

Writing objects: 100% (25/25), 1.89 KiB | 644.00 KiB/s, done.

Total 25 (delta 5), reused 0 (delta 0), pack-reused 0

remote: Resolving deltas: 100% (5/5), done.

To https://github.com/kiyong94/sample.git

* [new branch] main -> main

branch 'main' set up to track 'origin/main'.
```

<br>

>### 새 커밋 Push

- 실습 : 원격 저장소 연결 후, 로컬에서 `navy` 파일을 만들고 `Push`

```
$ touch navy
$ echo "네이비" >> navy

$ git add -A

$ git commit -m "add navy"
```
```
[main 97cadb2] add navy

1 file changed, 1 insertion(+)

create mode 100644 navy
```
```
$ git push
```
```
Enumerating objects: 4, done.

Counting objects: 100% (4/4), done.

Delta compression using up to 4 threads

Compressing objects: 100% (2/2), done.

Writing objects: 100% (3/3), 271 bytes | 271.00 KiB/s, done.

Total 3 (delta 1), reused 0 (delta 0), pack-reused 0

remote: Resolving deltas: 100% (1/1), completed with 1 local object.

To https://github.com/kiyong94/sample.git

9ab301d..97cadb2 main -> main
```

<br>

>### 원격 저장소 복제

-  `git clone <원격저장소 주소> [원하는 폴더이름]` : 이미 존재하는 원격저장소를 로컬저장소로 복제해온다.

```
$ cd .. 	// 새로운 디렉토리를 생성하기 위해 상위 디렉토리로 이동

$ git clone https://github.com/kiyong94/sample.git sample-2 	// sample-2 디렉토리에 원격 저장소를 복제
```
```
Cloning into 'sample-2'...

remote: Enumerating objects: 28, done.

remote: Counting objects: 100% (28/28), done.

remote: Compressing objects: 100% (11/11), done.

remote: Total 28 (delta 6), reused 28 (delta 6), pack-reused 0

Receiving objects: 100% (28/28), done.

Resolving deltas: 100% (6/6), done.
```

- 실습 : 동일한 원격 저장소를 바라보는 두 개의 로컬저장소 중 하나의 저장소에서 변화 주기.

```
$ cd sample 

$ touch purple 

$ echo "보라" >> purple

$ git add -A 

$ git commit -m "add purple" // 새 커밋 작성
```
```
[main c4b0f3d] add purple

1 file changed, 1 insertion(+)

create mode 100644 purple
```
```
$ git push 
```
```
Enumerating objects: 4, done.

Counting objects: 100% (4/4), done.

Delta compression using up to 4 threads

Compressing objects: 100% (2/2), done.

Writing objects: 100% (3/3), 270 bytes | 270.00 KiB/s, done.

Total 3 (delta 1), reused 0 (delta 0), pack-reused 0

remote: Resolving deltas: 100% (1/1), completed with 1 local object.

To https://github.com/kiyong94/sample.git

97cadb2..c4b0f3d main -> main
```

<br>

>### 원격 저장소 내용 가져오기

-  `git pull [원격 저장소의 이름] [원격 저장소에서 받아오고자 하는 브랜치의 이름]`
: 원격 저장소에 변경된 내용을 로컬 저장소로 가져옵니다.

-  `sample` 로컬 저장소와 GitHub 저장소는 `purple`이 추가되어 있고, `sample-2` 저장소는 아직 추가되지 않은 상태.

```
$ cd sample-2 // sample-2 디렉토리로 이동

$ git pull // 원격 저장소 pull 명령어 입력
```
```
remote: Enumerating objects: 4, done.

remote: Counting objects: 100% (4/4), done.

remote: Compressing objects: 100% (1/1), done.

remote: Total 3 (delta 1), reused 3 (delta 1), pack-reused 0

Unpacking objects: 100% (3/3), 250 bytes | 16.00 KiB/s, done.

From https://github.com/kiyong94/sample

97cadb2..c4b0f3d main -> origin/main

Updating 97cadb2..c4b0f3d

Fast-forward

purple | 1 +

1 file changed, 1 insertion(+)

create mode 100644 purple
```
```
$ ls
```
```
black blue green navy purple red white 			// purple 파일이 생긴 것을 확인
```

- 원격 저장소와 로컬 저장소의 차이가 커지면 나중에 충돌이 많이 발생함.
	- 그러므로 `git Pull`은 자주 수행하는 것이 좋습니다.
